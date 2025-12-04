package rvt;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList; 

public class JMArrayList {
    public static void main(String[] args) {
        //Tests
    }
    public static void onlyTheseNumbers() {
class onlyTheseNumbers {
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

    }
    public static void listSize() {
        class listSize {
            public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("Enter a string (or 'end' to stop):");
                    String input = scanner.nextLine();
                    if (input.equals("end")) {
                        break;
                    }
                    list.add(input);
                }
                System.out.println("In total: " + list.size());
        
        
            }
        }
    }
    public static void onTheList(String[] args) {
         class onTheList {
            ArrayList<String> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
        
            public static void main(String[] args) {
                onTheList instance = new onTheList();
                instance.addToList();
            }
        
            public void addToList() {
                while (true) {
                    System.out.println("Enter a string (or empty string to stop):");
                    String input = scanner.nextLine();
                    if (input.equals(null) || input.isEmpty()) {
                        break;
                    }
                    list.add(input);
                }
                System.out.println("Search for?");
                String search = scanner.nextLine();
                if (list.contains(search)) {
                    System.out.println(search + " was found!");
                } else {
                    System.out.println(search + " was not found!");
                }
            }
        }
    }
    public static void removeLast() {
         class removeLast {

            public static void removeLast (ArrayList<String> strings2) {
                ArrayList<String> strings = new ArrayList<>();
        
        
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        
        System.out.println(strings);
        
        removeLast(strings);
        removeLast(strings);
        
        System.out.println(strings);
            }
        }    
    }
}

