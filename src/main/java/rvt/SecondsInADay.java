package rvt;
import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days would you like to convert to seconds? ");
        
        int userInput = Integer.valueOf(scanner.nextLine());

        int calculatedInput = userInput * 24 * 60 * 60;

        System.out.println("" + calculatedInput);
    }
}
