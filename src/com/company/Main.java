package com.company;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию мобильного приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        // Далее последует два варианта решения, поскольку "Важное условие" из задачи не сумел интерпритировать однозначно.
//        if (clientOS == 0 && clientDeviceYear >= 2015) {
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        } else if (clientOS == 0) {
//            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//        } else if (clientDeviceYear < 2015) {
//            System.out.println("Установите облегченную версию приложения для Android по ссылке");
//        } else {
//            System.out.println("Установите версию мобильного приложения для Android по ссылке");
//        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию мобильного приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {
        int year = 2000;
        boolean isYearLeap = year % 4 == 0;
        if (year % 100 == 0) {
            isYearLeap = false;
        }
        if (year % 400 == 0) {
            isYearLeap = true;
        }
        if (isYearLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int daysDelivery = 1;
        if (deliveryDistance <= 20) {
            daysDelivery = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            daysDelivery += 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            daysDelivery += 2;
        } else {
            daysDelivery = 0;
        }
        if (daysDelivery != 0) {
            System.out.println("Потребуется дней: " + daysDelivery);
        } else {
            System.out.println("Вынуждены принести свои извинения, но доставка далее чем на 100 км не работает.");
        }
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
