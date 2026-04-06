package com.example;

import java.util.Scanner;

public class Calculator {
    public static int getPoshlina() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет, введите цену");

        int price = sc.nextInt();
        System.out.println("Введите вес товара");
        int weight = sc.nextInt();

        return price / 100 + weight * 100;
    }
}
