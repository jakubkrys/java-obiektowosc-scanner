import java.util.Scanner;

public class FuelBalance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, "UTF-8");

        double[] records = new double[5];
        int o = 0;
        int n = 0;
        int choose;

        do {
            System.out.println();
            System.out.println("----- MENU -----");
            System.out.println("1. Dodaj wpis");
            System.out.println("2. Wyświetl średnią spalania");
            System.out.println("3. Zakończ działanie programu");
            System.out.println();
            System.out.println("Co chcesz teraz zrobić?");
            choose = scanner.nextInt();
            scanner.nextLine();


            switch (choose) {
                case 1:
                    System.out.println("Podaj ilość przejechanych kilometrów:");
                    int kilometers = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Podaj ilość spalonych litrów paliwa:");
                    double usage = scanner.nextDouble();
                    scanner.nextLine();
                    if (o < records.length) {
                        records[o] = ((usage / kilometers) * 100);
                        o++;
                    } else {
                        o = n;
                        records[o] = ((usage / kilometers) * 100);
                        o++;
                    }
                    //System.out.println(records[o]);
                    System.out.println(records[0]);
                    System.out.println(records[1]);
                    System.out.println(records[2]);
                    break;
                case 2:
                    System.out.println("Aktualna średnia spalania: "+((records[0]+records[1]+records[2]+records[3]+records[4])/ records.length));
                    break;
                case 3:
                    break;
            }
        } while (choose != 3) ;
    }
}