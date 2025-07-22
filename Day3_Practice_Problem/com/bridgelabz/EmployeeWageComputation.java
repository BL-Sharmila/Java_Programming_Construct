package com.bridgelabz;
import java.util.Random;

public class EmployeeWageComputation {
    // Constants
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int empHours, empWage, totalEmpWage = 0, totalHours = 0, totalDays = 0;

        while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
            totalDays++;
            int empCheck = new Random().nextInt(3); // 0 - Absent, 1 - PartTime, 2 - FullTime

            switch (empCheck) {
                case 1: // Part-time
                    empHours = PART_TIME_HOUR;
                    break;
                case 2: // Full-time
                    empHours = FULL_DAY_HOUR;
                    break;
                default: // Absent
                    empHours = 0;
            }

            empWage = empHours * WAGE_PER_HOUR;
            totalEmpWage += empWage;
            totalHours += empHours;

            System.out.println("Day " + totalDays + " - Hours: " + empHours + ", Daily Wage: " + empWage);
        }

        System.out.println("\nTotal Working Days: " + totalDays);
        System.out.println("Total Working Hours: " + totalHours);
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}
