package datatypes;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предыдущее значение электросчетчика: ");
        int previous = scanner.nextInt();

        System.out.println("Введите текущее значение электросчетчика: ");
        int current = scanner.nextInt();

        if (previous > current) {
            System.out.println("Вы перепутали значения прошу внести заново");
            scanner.close();
            return;
        }

        int diff = current - previous;
        int result = diff * 21;
        System.out.println("Вы потребили " + diff + " кВт \n" +
                "Тариф: 21тг \n" +
                "К оплате: " + result + "тг");

        scanner.close();
    }
}
