package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       // Ja mēs dalam (int) ar (int)
       // Rezultātā vienmēr būs (int)
       int a = 7;
       int b = 2;
       //type-casting
       System.out.println(
        // a / Double.valueOf(b)
        // a / (double) b
        1.0 * a / b
       );
    }
}
