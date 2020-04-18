package com.vuonglab.hennaandphu; // suppress missing package statement warning from Android Studio

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

public class TimeZoneUnitTestGenerator {
	public static void main(String[] args) {
		generateTimeZoneDaylightSavingTimeUnitTests();
	}

	private static void generateTimeZoneDaylightSavingTimeUnitTests() {
		final LocalDateTime testDateTimeInPhoenix = LocalDateTime.of(2046, 7, 29, 18, 53, 46);
		final int years = 31, months = 4, days = 15;
		final int hours = 9, minutes = 26, seconds = 53;
		generateTimeZoneUnitTests(testDateTimeInPhoenix,
			years, months, days,
			hours, minutes, seconds
		);
	}

	private static void generateTimeZoneUnitTests(
			LocalDateTime testDateTimeInPhoenix,
		  	int years, int months, int days,
		  	int hours, int minutes, int seconds)
	{
		Map<String, Integer> allTimeZoneNamesAndOffsets = getAllTimeZoneNamesAndOffsets(testDateTimeInPhoenix);

		for (Map.Entry<String, Integer> timeZoneToTest : allTimeZoneNamesAndOffsets.entrySet()) {
			String timeZoneName = timeZoneToTest.getKey();
			Integer zoneOffsetInSeconds = timeZoneToTest.getValue();

			String unitTestName = generateUnitTestName(timeZoneName);

			int offsetHours = zoneOffsetInSeconds / (60 * 60);
			int offsetMinutes = (zoneOffsetInSeconds % (60 * 60)) / 60;

			// The time in Phoenix (GMT-7) is in testDateTimeInPhoenix
			// Calculate the time in the time zone being tested.
			LocalDateTime testDateTime = testDateTimeInPhoenix.minusMinutes(-offsetMinutes).minusHours(-(offsetHours+7));

			String timeZoneOffset = String.format("%+03d:%02d", offsetHours, offsetMinutes);

			printUnitTest(unitTestName, testDateTime, timeZoneName, timeZoneOffset,
				years, months, days,
				hours, minutes, seconds
			);
		}
	}

	private static Map<String, Integer> getAllTimeZoneNamesAndOffsets(LocalDateTime testDateTimeInPhoenix) {
		Map<String, Integer> timeZoneNamesAndOffsets = new HashMap<>();

		for (String zoneId : ZoneId.getAvailableZoneIds()) {
			ZoneId id = ZoneId.of(zoneId);

			ZonedDateTime zonedDateTime = ZonedDateTime.of(testDateTimeInPhoenix, id);
			ZoneOffset zoneOffset = zonedDateTime.getOffset();
			int zoneOffsetInSeconds = zoneOffset.getTotalSeconds();

			timeZoneNamesAndOffsets.put(zoneId, zoneOffsetInSeconds);
		}

		return timeZoneNamesAndOffsets;
	}

	private static String generateUnitTestName(String timeZoneName) {
		String unitTestName = timeZoneName.replace('/', '_');
		unitTestName = unitTestName.replace("+", "plus");

		String[] unitTestNameParts = unitTestName.split("-");
		boolean nameContainsNegativeNumber = (unitTestNameParts.length == 2 && unitTestNameParts[1].matches("^\\d+$"));
		unitTestName = unitTestName.replace("-", nameContainsNegativeNumber ? "minus" : "_");

		return unitTestName;
	}

	private static void printUnitTest(String unitTestName, LocalDateTime testDateTime,
									  String timeZoneName, String timeZoneOffset,
									  int years, int months, int days,
									  int hours, int minutes, int seconds)
	{
		System.out.println("@Test");
		System.out.println(String.format("public void %s() {", unitTestName));
		System.out.println(String.format("\tZonedDateTime now = getDateTimeInATimeZone(%d, %d, %d, %d, %d, %d, \"%s\"); // GMT%s",
				testDateTime.getYear(), testDateTime.getMonthValue(), testDateTime.getDayOfMonth(),
				testDateTime.getHour(), testDateTime.getMinute(), testDateTime.getSecond(),
				timeZoneName, timeZoneOffset));
		System.out.println("\tDuration marriedDuration = DurationCalculator.getMarriedDuration(now);");
		System.out.println(String.format("\tassertDuration(marriedDuration, new Duration(%d, %d, %d, %d, %d, %d));",
			years, months, days, hours, minutes, seconds));
		System.out.println("}\n");
	}
}