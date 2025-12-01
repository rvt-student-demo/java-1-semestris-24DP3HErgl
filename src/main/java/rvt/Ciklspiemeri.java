package rvt;

import java.util.Scanner;

public class Ciklspiemeri {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int totalUserInputs = 0;
int sum = 0;

while (true) {
    if (totalUserInputs == 5) {
        break;
    }

    System.out.println("Input number");
    sum = sum + Integer.valueOf(scanner.nextLine());
    totalUserInputs = totalUserInputs + 1;
}

System.out.println("The sum of the numbers is " + sum);

    }

}
