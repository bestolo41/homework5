import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
        //task3();
        //task4();
        //task5();
    }

    public static void task1() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Укажите Вашу операционную систему:\n0 - iOS\n1 - Android");
        int clientOS = answer.nextInt();

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректный ответ. Попробуйте снова");
        }
    }
    public static void task2() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Укажите Вашу операционную систему:\n0 - iOS\n1 - Android");
        int clientOS = answer.nextInt();


        if (clientOS == 0) {
            System.out.println("Укажите год выпуска вашего девайса:");
            int clientDeviceYear = answer.nextInt();
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            System.out.println("Укажите год выпуска вашего девайса:");
            int clientDeviceYear = answer.nextInt();
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Некорректный ответ. Попробуйте снова");
        }
    }
    public static void task3() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Укажите год:");
        int year = answer.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.printf("%d год является високосным", year);
        } else if (year % 400 == 0) {
            System.out.printf("%d год является високосным", year);
        } else {
            System.out.printf("%d год не является високосным", year);
        }
    }
    public static void task4() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Укажите расстояние:");
        int deliveryDistance = answer.nextInt();
        int deliveryTime = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            deliveryTime = ((deliveryDistance - 20) / 40) * deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    public static void task5() {
        Scanner answer = new Scanner(System.in);
        System.out.println("Укажите номер меяца:");
        int monthNumber = answer.nextInt();

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.printf("%d месяц принадлежит сезону зима", monthNumber);
                break;
            case 3:
            case 4:
            case 5:
                System.out.printf("%d месяц принадлежит сезону весна", monthNumber);
                break;
            case 6:
            case 7:
            case 8:
                System.out.printf("%d месяц принадлежит сезону лето", monthNumber);
                break;
            case 9:
            case 10:
            case 11:
                System.out.printf("%d месяц принадлежит сезону осень", monthNumber);
                break;
            default:
                System.out.println("Некорректный ввод");
        }
    }
}