package edu.iutcs.cr;

import java.util.Scanner;

/**
 * @author Raian Rahman
 * @since 4/19/2024
 */
public class Menu {

    private static void showMainMenu() {
        System.out.println("Please enter the type of vehicle [1-9]: ");
        System.out.println("1. Add new seller");
        System.out.println("2. Add new customer");
        System.out.println("3. Add car");
        System.out.println("4. View inventory");
        System.out.println("5. View seller list");
        System.out.println("6. View buyer list");

        System.out.println();
        System.out.println("7. Add new order");
        System.out.println("8. View all invoices");

        System.out.println();
        System.out.println("9. Save System and Exit");
    }

    public static void showVehicleMenu() {
        System.out.println("Please enter the type of vehicle [1-6]: ");
        System.out.println("1. Bus");
        System.out.println("2. Car");
        System.out.println("3. Hatchback");
        System.out.println("4. Sedan");
        System.out.println("5. SUV");
    }


    public static int showAndSelectOperation() {
        Scanner scanner = new Scanner(System.in);
        showMainMenu();
        int selectedOperation = -1;

        while(selectedOperation<1 || selectedOperation>9) {
            System.out.print("Enter your choice: ");
            selectedOperation = scanner.nextInt();

            if(selectedOperation<1 || selectedOperation>9) {
                System.out.print("Enter a valid operation: ");
            }
        }

        return selectedOperation;
    }

    public static void showOrderMenu() {
        System.out.println("Please enter the type of operation: [1-5]");
        System.out.println("1. Add new vehicle to cart");
        System.out.println("2. Remove vehicle from cart");
        System.out.println("3. View cart");
        System.out.println("4. Confirm purchase");
        System.out.println();
        System.out.println("5. Return to main menu");
    }
}
