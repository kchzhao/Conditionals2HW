public class Main {
    public static void main(String[] args) {
        //HW1 Exercise 1
        System.out.println("HW1 Exercise 1");
        int clientOS = 1;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //HW1 Exercise 2
        System.out.println();
        System.out.println("HW1 Exercise 2");
        int clientDeviceYear = 2015;
        if(clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if(clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //HW1 Exercise 3
        System.out.println();
        System.out.println("HW1 Exercise 3");
        int year = 2021;
        boolean leapYear = year % 4 == 0;
        if(leapYear){
            System.out.println(year + " год является високосным");
        }
        else{
            System.out.println(year + " год не является високосным");
        }

        //HW1 Exercise 4
        System.out.println();
        System.out.println("HW1 Exercise 4");
        int deliveryDistance = 95;
        if(deliveryDistance < 20){
            System.out.println("Потребуется дней: 1" );
        }
        else if(deliveryDistance >= 20 && deliveryDistance < 60){
            System.out.println("Потребуется дней: 2" );
        }
        else if(deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Потребуется дней: 3" );
        }

        //HW1 Exercise 5
        System.out.println();
        System.out.println("HW1 Exercise 5");
        int monthNumber = 18;

        switch (monthNumber) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Fall");
                break;
            case 10:
                System.out.println("Fall");
                break;
            case 11:
                System.out.println("Fall");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("There are only 12 months");
        }
    }
}