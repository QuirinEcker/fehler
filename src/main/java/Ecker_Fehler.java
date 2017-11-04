import java.util.Scanner;

public class Ecker_Fehler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double relativerfehler;
        double absuluterfehler;

        System.out.print("Istwert");
        double istwert = scanner.nextDouble();
        System.out.print("Sollwert");
        double sollwert = scanner.nextDouble();

        absuluterfehler = sollwert - istwert;

        if (absuluterfehler < 0) {
            absuluterfehler = absuluterfehler * -1;
        }

        relativerfehler = 100 / sollwert * absuluterfehler;

        System.out.println(absuluterfehler);
        System.out.println(relativerfehler);




    }
}
