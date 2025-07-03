package textconditions;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите км/ч: ");
        int speed1 = scanner.nextInt();

        System.out.println("Введите м/с: ");
        int speed2 = scanner.nextInt();

        int convertSpeed1 = speed1 * 5 / 18;

        if (convertSpeed1 > speed2) {
            System.out.println("Первая скорость больше");
        }

        if (convertSpeed1 < speed2) {
            System.out.println("Вторая скорость больше");
        }
    }
}
