package app.utility;
import app.core.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroceryItemUtilities {
    public static void sortByQuantityInStock(List<GroceryItem> groceryItems) {
        Collections.sort(groceryItems, new Comparator<GroceryItem>() {
            @Override
            public int compare(GroceryItem gi1, GroceryItem gi2) {
                return Integer.compare(gi1.getQuantityInStock(), gi2.getQuantityInStock());
            }
        });
    }

    public static List<GroceryItem> getFirst10ItemsWithLowestQuantityInStock(List<GroceryItem> groceryItems) {
        sortByQuantityInStock(groceryItems);
        return groceryItems.subList(0, Math.min(10, groceryItems.size()));
    }

    public static List<GroceryItem> removeOutOfStockItems(List<GroceryItem> groceryItems) {
        List<GroceryItem> result = new ArrayList<>();
        for (GroceryItem gi : groceryItems) {
            if (gi.getQuantityInStock() > 0) {
                result.add(gi);
            }
        }
        return result;
    }
}