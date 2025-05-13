import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();

        try {
            Date d1 = new Date(1, 1, 2023);
            Date d2 = new Date(29, 2, 2024); // Leap year
            Date d3 = new Date(31, 4, 2022); // Invalid
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Date date1 = new Date(15, 5, 2020);
        Date date2 = new Date(10, 12, 2022);

        System.out.print("Original Date1: ");
        date1.printDate();

        date1.updateDate(20, 6, 2021);
        System.out.print("Updated Date1: ");
        date1.printDate();

        System.out.println("Day of the week for Date2: " + date2.getDayOfWeek());
        System.out.println("Difference in days: " + date1.calculateDifference(date2));

        dates.add(new Date(25, 12, 2022));
        dates.add(new Date(1, 1, 2020));
        dates.add(new Date(14, 2, 2021));

        Collections.sort(dates);
        System.out.println("\nSorted Dates:");
        for (Date d : dates) {
            d.printDate();
        }
    }
}