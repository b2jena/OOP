package TutortAcademy;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // minimum of 3
        System.out.println("Enter 3 numbers to find out the minimum among them");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a <= b && a <= c) {
            // a is the least
            System.out.println("minimum of the given 3: " + a);
        }
        // eligible for marriage
        System.out.println("Are you eligible for marriage? Let's see:\n" +
                "Enter boy's age:");
        int boy = in.nextInt();
        System.out.println("Enter girl's age: ");
        int girl = in.nextInt();
        if (boy >= 21 && girl >= 18) {
            System.out.println("Yes, you guys are eligible for marriage");
        } else {
            System.out.println("No, you guys are not eligible for marriage");
        }

        // print tax amount if bill amount is 50000 above then tax is 10% else 5% , using ternary operator
        System.out.print("Enter your bill amount: ");
        int bill = in.nextInt();
        int afterTax = (bill >= 50000) ? bill / 10 : bill / 20;
        System.out.println("Tax amount: " + afterTax);
        // check year is leap or not
        System.out.println("Let's see if the year is leap year or not. Enter a year: ");
        int year = in.nextInt();
        if (isLeapYear(year)) {
            System.out.println("Wow! It's a leap year.");
        } else {
            System.out.println("Oh! It's not a leap year.");
        }
        /*
         * check number is odd or not, print odd or even*/
        System.out.println("Even or odd. Enter a number:");
        int num = in.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd");
        }
    }

    private static boolean isEven(int num) {
        return (num & 1) == 0;
    }

    private static boolean isLeapYear(int year) {
        // by default, it's false;
        boolean isLeapYear;
        // divisible by 4, not by 100, or divisible by 400
        isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        return isLeapYear;
    }
}
