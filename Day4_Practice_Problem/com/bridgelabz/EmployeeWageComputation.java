package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        int totalEmpWage = 0;

        while (totalEmpHours < MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;
            int empHours = 0;

            int empCheck = new Random().nextInt(3);
            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            if (totalEmpHours + empHours > MAX_WORKING_HOURS) {
                empHours = MAX_WORKING_HOURS - totalEmpHours;
            }

            totalEmpHours += empHours;
            int dailyWage = empHours * WAGE_PER_HOUR;
            totalEmpWage += dailyWage;

            System.out.println("Day#: " + totalWorkingDays +
                    " Worked Hours: " + empHours + " Wage: " + dailyWage);
        }

        System.out.println("\nTotal Days Worked: " + totalWorkingDays);
        System.out.println("Total Hours Worked: " + totalEmpHours);
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}
