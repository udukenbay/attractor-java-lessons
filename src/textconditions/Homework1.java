package textconditions;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название футбольного клуба: ");

        String input = scanner.nextLine();
        System.out.println("Количество символов: " + input.length());
        System.out.println("В заглавных буквах: " + input.toUpperCase());
        System.out.println("В строчных буквах: " + input.toLowerCase());
    }
}
