package javaprogram;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class CalendarTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for day, month, and year input
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        try {
            // Create a LocalDate object
            LocalDate inputDate = LocalDate.of(year, month, day);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Display the input date
            System.out.println("\nInput date: " + inputDate.format(formatter));

            // Add 4 days
            LocalDate fourDaysLater = inputDate.plusDays(4);
            System.out.println("Date after 4 days: " + fourDaysLater.format(formatter));

            // Add 4 months
            LocalDate fourMonthsLater = inputDate.plusMonths(4);
            System.out.println("Date after 4 months: " + fourMonthsLater.format(formatter));

            // Add 4 years
            LocalDate fourYearsLater = inputDate.plusYears(4);
            System.out.println("Date after 4 years: " + fourYearsLater.format(formatter));
        } catch (Exception e) {
            System.out.println("Invalid date entered. Please try again.");
        }

        scanner.close();
    }
}

