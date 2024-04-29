package app.core;
import java.time.LocalDateTime;

public class GroceryItem {
    private String name;
    private double pricePerUnit;
    private int quantityInStock;
    private LocalDateTime stockUpdateDateTime;

    public GroceryItem(String name, double pricePerUnit, int quantityInStock) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantityInStock = quantityInStock;
        this.stockUpdateDateTime = LocalDateTime.now();
    }

   

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
}

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
        this.stockUpdateDateTime = LocalDateTime.now();
    }

    public LocalDateTime getStockUpdateDateTime() {
        return stockUpdateDateTime;
    }

    public void setStockUpdateDateTime(LocalDateTime stockUpdateDateTime) {
        this.stockUpdateDateTime = stockUpdateDateTime;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", quantityInStock=" + quantityInStock +
                ", stockUpdateDateTime=" + stockUpdateDateTime +
                '}';
    }
}