package third;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void printMenu() {
        System.out.println("Co chcesz zrobic?\n 1.Dodaj element\n 2.Wypisz liste\n 3.Usun element\n 4.Usun liste\n 5.Zakoncz program");
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.println("Twój wybór: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Podaj klucz i wartość");
                    map.put(scanner.next(), scanner.next());
                    continue;
                case 2:
                    System.out.println("Wypisywanie");
                    System.out.println(map);
                    continue;

                case 3:
                    System.out.println("Podaj klucz wartosci do usuniecia");
                    map.remove(scanner.next());
                    continue;
                case 4:
                    System.out.println("Czyszczenie kolekcji");
                    map.clear();
                    continue;
                case 5:
                    break;
            }
            break;
        }
    }
}