
package app.tester;
import java.util.Scanner;

import app.core.GroceryItemService;
import app.exception.GroceryItemException;
import app.utility.*;
import app.validation.*;
import app.utility.*;
public class Main {
    public static void main(String[] args) {
        GroceryItemService groceryItemService = new GroceryItemService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add a new grocery item");
            System.out.println("2. Update the quantity of a grocery item in stock");
            System.out.println("3. Display the list of grocery items including their name, price and quantities");
            System.out.println("4. Remove all items which are out of stock");
            System.out.println("5. Display the first 10 items with the lowest quantity in stock");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter price per unit: ");
                    double pricePerUnit = scanner.nextDouble();
                    System.out.print("Enter quantity in stock: ");
                    int quantityInStock = scanner.nextInt();
                    try {
                        groceryItemService.addGroceryItem(name, pricePerUnit, quantityInStock);
                    } catch (GroceryItemException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter name: ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    System.out.print("Enter quantity in stock: ");
                    quantityInStock = scanner.nextInt();
                    try {
                        groceryItemService.updateQuantityInStock(name, quantityInStock);
                    } catch (GroceryItemException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    groceryItemService.displayGroceryItems();
                    break;
                case 4:
                    groceryItemService.removeOutOfStockItems();
                    break;
                case 5:
                    groceryItemService.displayFirst10ItemsWithLowestQuantityInStock();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}