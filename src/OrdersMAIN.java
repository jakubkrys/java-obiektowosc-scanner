import java.util.Scanner;

public class OrdersMAIN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        String[] orders = new String[1000];
        int o = 0;
        int choose;

            do {
                System.out.println();
                System.out.println("----- MENU -----");
                System.out.println("1. Złóż zamówienie");
                System.out.println("2. Wyświetl wszystkie zamówienia");
                System.out.println("3. Zakończ działanie programu");
                System.out.println();
                System.out.println("Co chcesz teraz zrobić?");
                choose = scanner.nextInt();
                scanner.nextLine();

                switch (choose) {
                    case 1:
                        System.out.println("Podaj imię:");
                        String name = new String();
                        name = scanner.nextLine();
                        System.out.println("Jaki napis chcesz umieścić na kubku?:");
                        String inscription = new String();
                        inscription = scanner.nextLine();
                        System.out.println("Ile kubków chcesz zamówić?:");
                        int amount = 0;
                        amount = scanner.nextInt();
                        scanner.nextLine();
                        orders[o] = (name + " | " + inscription + " | " + amount);
                        System.out.println(orders[o]);
                        o++;
                        break;
                    case 2:
                        for (o = 0; o >= 0 && orders[o] != null; o++) {
                            System.out.println(orders[o]);
                        }
                        break;
                    case 3:
                        break;
                }
            } while (choose != 3);
    }
}
