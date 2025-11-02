import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to PhoneBookApp");

        Scanner input = new Scanner(System.in);
        boolean appRunning = true;
        int userChoice;

        while(appRunning){
            System.out.println("""
                    Please select an option:
                    1. Show phone book list
                    2. Add new contact
                    3. Remove a contact
                    4. Edit contact information
                    0. Exit PhoneBook App""");
            userChoice = input.nextInt();

            switch(userChoice){
                case 1 -> System.out.println();
                case 2 -> System.out.println();
                case 3 -> System.out.println();
                case 4 -> System.out.println();
                case 0 -> {
                    appRunning = false;
                    System.out.println("Closeing PhoneBookApp\n");
                }
                default -> {
                    System.out.println("Invalid option");
                }
            }


        }
    }
}
