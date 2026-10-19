import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String tytul = "tenis";
        String tresc = "Gra z Ewą w tenis";
        boolean priorytet = true;

        Notatka notatka1 = new Notatka(tytul, tresc, priorytet);

        System.out.println("Podaj tytuł notatki: ");
        Scanner scanner = new Scanner(System.in);
        String tytul2 = scanner.nextLine().toString();

        Notatka notatka2 = new Notatka(tytul2);

        notatka1.wypiszNotatke();
        notatka2.wypiszNotatke();
    }
}