import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Проверка високосных годов
        checkLeapYear(2020);
        checkLeapYear(1900);
        checkLeapYear(2000);
        checkLeapYear(2021);

        // Задача 2: Проверка версии приложения
        int currentYear = LocalDate.now().getYear();

        checkAppVersion(0, 2015);
        checkAppVersion(1, 2022);
        checkAppVersion(2, 2020);

        // Задача 3: Расчет дней доставки карты
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    //Задача 1
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //Задача 2
    public static void checkAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        String osName;

        if (osType == 0) {
            osName = "iOS";
        } else if (osType == 1) {
            osName = "Android";
        } else {
            System.out.println("Неизвестный тип ОС");
            return;
        }
        boolean isOldDevice = deviceYear < (currentYear - 9);

        if (isOldDevice) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке.");
        } else {
            System.out.println("Установите обычную версию приложения для " + osName + ".");
        }
    }

    //Задача 3
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            // свыше 100 км доставка невозможна
            return 0;
        }
    }
}