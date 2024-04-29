package app.core;
import app.exception.*;
import app.utility.*;
import app.validation.*;
import app.core.*;
import java.util.ArrayList;
import java.util.List;

public class GroceryItemService {
    private List<GroceryItem> groceryItems;

    public GroceryItemService() {
        groceryItems = new ArrayList<>();
    }

    public void addGroceryItem(String name, double pricePerUnit, int quantityInStock) throws GroceryItemException {
        if (!GroceryItemValidation.isValidName(name)) {
            throw new GroceryItemException("Invalid name");
        }
        if (!GroceryItemValidation.isValidPricePerUnit(pricePerUnit)) {
            throw new GroceryItemException("Invalid price per unit");
        }
        if (!GroceryItemValidation.isValidQuantityInStock(quantityInStock)) {
            throw new GroceryItemException("Invalid quantity in stock");
        }

        GroceryItem groceryItem = new GroceryItem(name, pricePerUnit, quantityInStock);
        groceryItems.add(groceryItem);
    }

    public void updateQuantityInStock(String name, int quantityInStock) throws GroceryItemException {
        for (GroceryItem groceryItem : groceryItems) {
            if (groceryItem.getName().equalsIgnoreCase(name)) {
                if (!GroceryItemValidation.isValidQuantityInStock(quantityInStock)) {
                    throw new GroceryItemException("Invalid quantity in stock");
                }
                groceryItem.setQuantityInStock(quantityInStock);
                return;
            }
        }
        throw new GroceryItemException("Grocery item not found");
    }

    public void displayGroceryItems() {
        for (GroceryItem groceryItem : groceryItems) {
            System.out.println(groceryItem);
        }
    }

    public void removeOutOfStockItems() {
        groceryItems = GroceryItemUtilities.removeOutOfStockItems(groceryItems);
    }

    public void displayFirst10ItemsWithLowestQuantityInStock() {
        List<GroceryItem> first10Items = GroceryItemUtilities.getFirst10ItemsWithLowestQuantityInStock(groceryItems);
        for (GroceryItem groceryItem : first10Items) {
            System.out.println(groceryItem);
        }
    }
}