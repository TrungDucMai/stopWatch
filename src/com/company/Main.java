package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Start the watch");
            System.out.println("2. End the watch");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Bat dau tai" + stopWatch.Start());
                    break;
                }
                case 2: {
                    System.out.println("Ket thuc tai" + stopWatch.End());
                    System.out.println("Thoi gian troi qua la : " + stopWatch.getElapsedTime());
                    break;
                }
                case 0:
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }
}

