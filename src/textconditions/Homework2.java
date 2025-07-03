package textconditions;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую фамилию: ");
        String surname1 = scanner.nextLine();

        System.out.println("Введите вторую фамилию: ");
        String surname2 = scanner.nextLine();

        if (surname1.length() > surname2.length()) {
            System.out.println("Фамилия " + surname1 + " длиннее и его длина: " + surname1.length());
        } else if (surname2.length() > surname1.length()) {
            System.out.println("Фамилия " + surname2 + " длиннее и его длина: " + surname2.length());
        } else {
            System.out.println("Фамилия " + surname1 + " и " + surname2 + " имеют одинаковую длинуДэ");
        }
    }
}
