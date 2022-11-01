package com.epam.rd.autotasks.godutch;
import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill = scanner.nextInt();
        int numberOfFriends = scanner.nextInt();
        int billWithTips = (bill / 10) + bill;
        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            int payment = billWithTips / numberOfFriends;
            System.out.println(payment);
        }
    }
}
