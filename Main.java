import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condizione = true;
        while (condizione == true) {

            System.out.println("Inserisci un numero intero positivo:");
            int numInt = scanner.nextInt();

            if (numInt <= 1) {
                System.out.println(numInt + " non è un numero primo");
            } else if (numInt <= 3) {
                System.out.println(numInt + " è un numero primo");
            } else if (numInt % 2 == 0 || numInt % 3 == 0) {
                System.out.println(numInt + " non è un numero primo");
            } else {

                int radiceQuadrata = (int) Math.sqrt(numInt);

                for (int i = 5; i <= radiceQuadrata; i += 6) {
                    if (numInt % i == 0 || numInt % (i + 2) == 0) {
                        System.out.println("è un numero primo");

                    } else {
                        System.out.println("non è un numero primo");
                    }
                }
            }


            System.out.println("Vuoi vedere se un' altro numero è primo?(si/no)");
            String anotherNumber = scanner.next();
            if (anotherNumber.equalsIgnoreCase("no")) {
                condizione = false;
                System.out.println("Arrivederci!");
            }
        }
        scanner.close();
    }
}


