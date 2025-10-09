package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preci:");
        String prece = scanner.nextLine();

        System.out.println("Ievadi cenu:");
        Double cena = Double.valueOf(scanner.nextLine());

        System.out.println("Ekspres piegadi (0=ne 1=ja)");
        int ekspresPiegade = scanner.nextInt();

        double piegadesCena;
        if (ekspresPiegade == 1) {
            piegadesCena = 3.00;
        } else {
            if (cena < 10.00) {
                piegadesCena = 2.00;
            } else {
                piegadesCena = 0.00;
            }
        }

        double kopa = cena + piegadesCena;

        System.out.println("Rekins");
        System.out.println(prece + " " + cena);
        System.out.println("piegade" + " " + piegadesCena);
        System.out.println("kopa" + " " + kopa);

        scanner.close();
    }
}
