/*
 * Date and Time API Example
 *
 * Demonstrates:
 * - LocalDate, LocalTime, LocalDateTime
 * - Instant
 * - Period and Duration
 * - DateTimeFormatter
 */

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // 1. LocalDate → represents only date (yyyy-MM-dd)
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        LocalDate birthday = LocalDate.of(1995, Month.APRIL, 15);
        System.out.println("Birthday: " + birthday);

        System.out.println("Day of Week: " + today.getDayOfWeek());
        System.out.println("Is Leap Year: " + today.isLeapYear());

        // 2. LocalTime → represents only time (HH:mm:ss)
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        LocalTime meetingTime = LocalTime.of(14, 30, 0);
        System.out.println("Meeting Time: " + meetingTime);

        // 3. LocalDateTime → combination of date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("LocalDateTime Now: " + now);

        LocalDateTime appointment = LocalDateTime.of(2025, Month.OCTOBER, 25, 10, 45);
        System.out.println("Appointment: " + appointment);

        // 4. Instant → represents timestamp in UTC
        Instant instantNow = Instant.now();
        System.out.println("Current Instant (UTC): " + instantNow);

        // 5. Period → difference between two dates (years, months, days)
        Period age = Period.between(birthday, today);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");

        // 6. Duration → difference between two times (hours, minutes, seconds)
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(17, 30);
        Duration workDuration = Duration.between(start, end);
        System.out.println("Work Duration: " + workDuration.toHours() + " hours " + workDuration.toMinutesPart() + " minutes");

        // 7. DateTimeFormatter → formatting dates and times
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedNow = now.format(formatter);
        System.out.println("Formatted LocalDateTime: " + formattedNow);

        // 8. Parsing date/time from string
        String dateStr = "22-10-2025 18:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateStr, formatter);
        System.out.println("Parsed LocalDateTime: " + parsedDateTime);

        // 9. Plus and Minus operations
        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastMonth = today.minusMonths(1);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Last Month: " + lastMonth);

        // 10. ChronoUnit → precise time unit calculations
        long daysBetween = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("Days between birthday and today: " + daysBetween);
    }
}
