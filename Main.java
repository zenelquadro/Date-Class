import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Date> dates = new ArrayList<>();

        try {
            Date validDate = new Date(29, 2, 2024); // Valid leap year date
            dates.add(validDate);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Date invalidDate = new Date(31, 4, 2022); // Invalid: April has 30 days
            dates.add(invalidDate);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Date date1 = new Date(15, 5, 2020);
        date1.updateDate(20, 6, 2021); // Valid update
        date1.updateDate(31, 6, 2021); // Invalid update

        Date date2 = new Date(10, 12, 2022);
        System.out.println("Day of the week for date2: " + date2.getDayOfWeek());

        int difference = date1.calculateDifference(date2);
        System.out.println("Difference in days between date1 and date2: " + difference);

        
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
