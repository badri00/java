package app.validation;

public class GroceryItemValidation {
    public static boolean isValidName(String name) {
        return name != null && !name.isEmpty();
    }

    public static boolean isValidPricePerUnit(double pricePerUnit) {
        return pricePerUnit > 0.0;
    }

    public static boolean isValidQuantityInStock(int quantityInStock) {
        return quantityInStock >= 0;
    }
}