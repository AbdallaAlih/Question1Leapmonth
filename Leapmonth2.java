/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.leapmonth2;

/**
 *
 * @author ABDULLAHI
 */
public class Leapmonth2 {

    // Method to check if a given month in a given year is a leap month
    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0);
        isLeapMonth = isLeapMonth || (month % 400 == 0);
        return isLeapMonth;
    }

    public static void main(String[] args) {
        // Example variables
        int year = 1977;
        int month = 1;

        // Check if the given month is a leap month
        if (isLeapMonth(year, month)) {
            System.out.println("Year " + year + ", Month " + month + " is a leap month.");
        } else {
            System.out.println("Year " + year + ", Month " + month + " is not a leap month.");
        }
    }
}

    
