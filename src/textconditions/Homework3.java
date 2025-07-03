package textconditions;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        int x = scanner.nextInt();

        double sin = Math.sin(x);
        double y;

        if (sin > 0) {
            y = Math.pow(sin, 2);
        } else {
            y = 1 - 2 * Math.pow(sin, 2);
        }

        System.out.println("y: " + y);
    }
}
