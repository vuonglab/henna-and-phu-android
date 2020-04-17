package com.vuonglab.hennaandphu; // suppress missing package statement warning from Android Studio

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;

public class TimeZoneUnitTestGenerator {
	public static void main(String[] args) {
		generateTimeZoneUnitTests();
	}

	private static void generateTimeZoneUnitTests() {
		final LocalDateTime testDateTimeInPhoenix = LocalDateTime.of(2046, 7, 29, 18, 53, 46);

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

			printUnitTest(unitTestName, testDateTime, timeZoneName, timeZoneOffset);
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

	private static void printUnitTest(String unitTestName, LocalDateTime testDateTime, String timeZoneName, String timeZoneOffset) {
		System.out.println("@Test");
		System.out.println(String.format("public void %s() {", unitTestName));
		System.out.println(String.format("\tZonedDateTime now = getDateTimeInATimeZone(%d, %d, %d, %d, %d, %d, \"%s\"); // GMT%s",
				testDateTime.getYear(), testDateTime.getMonthValue(), testDateTime.getDayOfMonth(),
				testDateTime.getHour(), testDateTime.getMinute(), testDateTime.getSecond(),
				timeZoneName, timeZoneOffset));
		System.out.println("\tDuration marriedDuration = DurationCalculator.getMarriedDuration(now);");
		System.out.println("\tassertDuration(marriedDuration, new Duration(31, 4, 15, 9, 26, 53));");
		System.out.println("}\n");
	}
}