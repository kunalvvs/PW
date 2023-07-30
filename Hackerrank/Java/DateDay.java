package Hackerrank.Java;

import java.util.*;

import java.util.*;

public class DateDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.close();

        String dayOfWeek = findDay(month, day, year);
        System.out.println(dayOfWeek);
    }

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Calendar.DAY_OF_WEEK returns integers from 1 (Sunday) to 7 (Saturday)
        String[] dayNames = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        return dayNames[dayOfWeek - 1];
    }
}

