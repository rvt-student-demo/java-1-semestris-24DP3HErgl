package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class onlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers:");

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("From where?");
        int start = scanner.nextInt();
        System.out.println("To where?");
        int end = scanner.nextInt();
        for (int number : numbers) {
            if (number >= start && number <= end) {
                System.out.println(number);
            }
        }
    } }
