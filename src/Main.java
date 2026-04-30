import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        CounterYears(1992);
        System.out.println();
        System.out.println("Задание 2");
        deviceYear(1,2026);
        System.out.println();
        System.out.println("Задание 3");
        calculateDeliveryDays(95);
    }

    public static void CounterYears(int year) {
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }


    public static void deviceYear(int clientOs, int clientDeviceYear) {
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для системы iOS по ссылке");
        } else if (clientOs == 0) {
            System.out.println("Установите приложение для системы iOS по ссылке");
        }
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для системы Android по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите приложение для системы Android по ссылке");
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("Для доставки потребуется 1 день.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Для доставки потребуется 2 дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Для доставки потребуется 3 дня.");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
    }
}




