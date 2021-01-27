import java.util.Scanner;

public class GameGuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        int numberToGuess = 124;
        int number = 0;
        int tries = 0;
        long startTime = System.currentTimeMillis();

        while (tries >= 0) {
            System.out.println("Wprowadź liczbę:");
            number = scanner.nextInt();
            scanner.nextLine();
            if (number > numberToGuess) {
                tries++;
                System.out.println("Podana liczba jest za duża");
                System.out.println("--------------------------");
            } else if (number < numberToGuess) {
                tries++;
                System.out.println("Podana liczba jest za mała");
                System.out.println("--------------------------");
            } else {
                tries++;
                System.out.println("Brawo! Znalazłeś poszukiwaną liczbę.");
                System.out.println("Ilość prób: "+tries);
                break;
            }
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Czas gry: "+((stopTime-startTime)/1000)+" sekund.");
    }
}
