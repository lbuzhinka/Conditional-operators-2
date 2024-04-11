public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\nTask 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("\nTask 3");
        int year = 2021;
        boolean ifTheYearIsALeap = (year % 4 == 0 || year % 400 == 0) && year % 100 != 0;
        boolean ifTheYearIsNotALeap = year % 4 != 0 || year % 400 != 0 || year % 100 == 0;
        if (year >= 1584 &&  ifTheYearIsALeap) {
                System.out.println(year + " год является високосным");
            }
        else if ( year < 1584 || ifTheYearIsNotALeap) {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("\nTask 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else if (deliveryDistance >= 20 && deliveryDistance < 60){
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays);}
        else if (deliveryDistance >= 60 && deliveryDistance <= 100 ) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays);}
        else {
            System.out.println("Расстояние слишком большое, доставки нет");
        }
        System.out.println("\nTask 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1,2, 12:
                System.out.println("Зимний месяц");
                break;
            case 3, 4, 5:
                System.out.println("Весенний месяц");
                break;
            case 6, 7, 8:
                System.out.println("Летний месяц");
                break;
            case 9, 10, 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");
        }




    }}

