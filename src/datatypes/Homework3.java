package datatypes;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предыдущее значение электросчетчика: ");
        int previous = scanner.nextInt();

        System.out.println("Введите текущее значение электросчетчика: ");
        int current = scanner.nextInt();

        System.out.println("Введите количество проживающих: ");
        int lives = scanner.nextInt();

        int overall = current - previous; // Общее потребление
        int limit1 = lives * 115;
        int limit2 = (190 - 115) * 3;
        int limit3 = overall - limit1 - limit2;

        System.out.println("Тариф: 16.24тг 21.8тг 25.6тг");
        double toPay1 = Math.ceil(limit1 * 16.24);
        double toPay2 = Math.ceil(limit2 * 21.8);
        double toPay3 = Math.ceil(limit3 * 25.6);
        double overallPay = toPay1 + toPay2 + toPay3;
        System.out.println("К оплате: \n" +
                "Первый уровень: " + toPay1 + "тг \n" +
                "Второй уровень:" + toPay2 + "тг \n" +
                "Третий уровень:" + toPay3 + "тг \n" +
                "Общая сумма: " + overallPay + "тг"
        );
    }
}
