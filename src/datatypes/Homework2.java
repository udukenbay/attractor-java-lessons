package datatypes;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Решаем ax2 + bx + c = 0");
        System.out.println("Введите значение a:");
        int a = scanner.nextInt();
        System.out.println("Введите значение b:");
        int b = scanner.nextInt();
        System.out.println("Введите значение c:");
        int c = scanner.nextInt();

        double discriminant = calculateDiscriminant(a, b, c);
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Первый корень уравнения: " + root1);
        System.out.println("Второй корень уравнения: " + root2);
    }

    public static double calculateDiscriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}
