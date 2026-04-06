package com.example;

import java.util.Scanner;

public class IP_USN {
    int earnings = 0;
    int spendings = 0;
    double result1;
    double result2;
    double economy;
    int system;
    Scanner sc = new Scanner(System.in);

    public String systemCompare(int earn, int spend) {
        result1 = earn * 0.06;
        result2 = (earn - spend) * 0.15;
        if (earn < spend) {
            result2 = 0;
        }
        if (result1 < result2) {
            economy = result2 - result1;
            system = 1;
            return "УСН доходы";
        } else {
            economy = result1 - result2;
            system = 2;
            return "УСН доходы минус расходы";
        }
    }

    public void startProgram() {
        while (true) {
            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогооблажения");
            String input = sc.nextLine();

            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    earnings += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    spendings += Integer.parseInt(sc.nextLine());
                    break;
                case 3:

                    System.out.printf("Мы советуем вам %s \n", systemCompare(earnings, spendings));
                    double pay = system == 1 ? result1 : result2;
                    double notPay = system == 2 ? result1 : result2;
                    System.out.printf("Ваш налог составит: %.2f рублей\n", pay);
                    System.out.printf("Налог на другой системе: %.2f рублей\n", notPay);
                    System.out.printf("Экономия: %.2f рублей", economy);
                    break;
                default:
                    System.out.println("Нет такой операции:");
                    break;
            }
        }
    }
}
