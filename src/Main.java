import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void CounterYears(int year) {
            if (year > 1584) {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
            }
        }

        public static void main(String[] args) {
            CounterYears(1992);
        }

    int currentYear = LocalDate.now().getYear();
        int
    int clientOS = 1;
        if (clientOS == 1 && clientDeviceYear < 2015) {
        System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
    } else if (clientOS == 1 && clientDeviceYear >= 2015) {
        System.out.println("«Установите обычную версию приложения для Android по ссылке»");
    }
        if (clientOS == 0 && clientDeviceYear < 2015) {
        System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
    } else if (clientOS == 0 && clientDeviceYear >= 2015) {
        System.out.println("«Установите обычную версию приложения для iOS по ссылке»");
    }
    }

