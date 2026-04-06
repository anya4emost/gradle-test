package com.example;

import java.util.Scanner;

public class VisGod {
    public int daysInYear(int year) {
        int days = 365;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            days = 366;
        }
        return days;
    }

    public boolean check(int year, int days) {
        if (daysInYear(year) == days) {
            return true;
        } else {
            return false;
        }
    }

    public void game() {
        Scanner sc = new Scanner(System.in);
        int year;
        int days;
        int counter = -1;

        do {
            System.out.print("Введите год:");
            year = sc.nextInt();
            System.out.print("Введите количество дней:");
            days = sc.nextInt();
            counter++;
        } while (check(year, days));

        int trueResult = daysInYear(year);
        System.out.printf("Неверно. Правильный ответ %d дней\n", trueResult);
        System.out.println("Вы набрали " + counter + " очков");
    }
}
