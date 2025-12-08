package rvt;
import java.util.Scanner;

public class Statistics {
    private int count = 0;
    private int sum = 0;

    public Statistics() {
        this.count = 0;
    }
    public void addNumber(int number) {
        sum += number;
        count++;
    }

    public int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    } 
    public double getAverage() {
        return count == 0 ? 0 : (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number == -1) {
                break;
            }
            allStats.addNumber(number);
            if (number % 2 == 0) {
                evenStats.addNumber(number);
            } else {
                oddStats.addNumber(number);
            }
        }
        System.out.println("Sum: " + allStats.getSum());
        System.out.println("Sum of even numbers:" + evenStats.getSum());
        System.out.println("Sum of odd numbers:" + oddStats.getSum());
    }
}
