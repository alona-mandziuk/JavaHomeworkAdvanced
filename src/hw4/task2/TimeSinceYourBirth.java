package hw4.task2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.*;

class TimeSinceYourBirth {

    static void timeFromBirthday(int year, int month, int day, int hour, int minutes) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate nowDate = LocalDate.now();
        LocalDateTime input = LocalDateTime.of(year, month, day, hour, minutes);
        LocalDate inputDate = LocalDate.of(year, month, day);

        Period diff = Period.between(inputDate, nowDate);

        long diffSec = Math.abs((SECONDS.between(now, input)) % 60);
        long diffMin = Math.abs((MINUTES.between(now, input)) % 60);
        long diffHour = Math.abs(HOURS.between(now, input) % 24);


        System.out.println("You are: " + diff.getYears() + " years, " + diff.getMonths() +
                " month, " + diff.getDays() + " days, " + diffHour + " hours, " + diffMin + " minutes, "
                + diffSec + " seconds old.");
    }


    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Input the year of yor birth: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("Input the month: ");
        scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("Input the day: ");
        scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println("Input the hour: ");
        scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        System.out.println("Input the minutes: ");
        scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        System.out.println("--------------------------------------------");
        timeFromBirthday(year, month, day, hour, min);
        System.out.println("--------------------------------------------");

    }
}
