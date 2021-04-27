package java_basics_package;

import org.junit.Test;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatePracticeJava8 {

    @Test
    public void datePractice() {
        //To get local date in a particular format

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        LocalDate localDate = LocalDate.now();
        System.out.println("local date :" + dtf.format(localDate));
    }

    @Test
    public void datePractice2() {
        //To get local time in a particular format

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println("local time :" + dtf.format(localTime));

        Instant now = Instant.now();
        System.out.println("Testing instant : " + now);
    }

    @Test
    public void printTimeStamp() {
        //To print timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("timestamp  : " + timestamp);

        // Convert Timestamp to Instant
        Instant instant = timestamp.toInstant();
        System.out.println("instant  : " + instant);                    // 2021-03-24T09:12:03.311Z
    }

    //Period to calculate the difference between two LocalDates.
    @Test
    public void localDateAndPeriod() {
        LocalDate from = LocalDate.of(2010, 5, 4);
        LocalDate to = LocalDate.of(2020, 10, 10);

        Period period = Period.between(from, to);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");
    }


    //Duration to calculate the difference between two LocalDateTimes.
    @Test
    public void localDateAndDuration() {
        LocalDateTime from = LocalDateTime.of(2020, 10, 4,
                10, 20, 55);
        LocalDateTime to = LocalDateTime.of(2020, 10, 10,
                10, 21, 1);

        Duration duration = Duration.between(from, to);

        // days between from and to
        System.out.println(duration.toDays() + " days");

        // hours between from and to
        System.out.println(duration.toHours() + " hours");

        // minutes between from and to
        System.out.println(duration.toMinutes() + " minutes");

        // seconds between from and to
        System.out.println(duration.getSeconds() + " seconds");


    }
}
