package WatchMethods;

import java.time.LocalDate;

import Allenum.BrandType;
import Allenum.CategoryType;
import Allenum.ShapeType;
import Allenum.StyleType;
import Allenum.WatchMaterialType;

public class Watch {
	int ID;
	static private int id=0;
	private String Name;
	private CategoryType Category;
	private BrandType Brand;
	private ShapeType Shape;
	private StyleType Style;
	private WatchMaterialType WatchBrandMaterial;
	private double Stock;
	private LocalDate StockListingDate;
	private LocalDate StockUpdateDate;
	private double price;
	private double Discount = 0.0;
	
	public Watch(String name, CategoryType category, BrandType brand, ShapeType shape, StyleType style,
			WatchMaterialType watchBrandMaterial, double stock, String stockListingDate, String stockUpdateDate,
			double price) {
		super();
		id++;
		ID = id;
		Name = name;
		Category = category;
		Brand = brand;
		Shape = shape;
		Style = style;
		WatchBrandMaterial = watchBrandMaterial;
		Stock = stock;
		StockListingDate = LocalDate.parse(stockListingDate);
		StockUpdateDate = LocalDate.parse(stockUpdateDate);
		this.price = price;
	}
	@Override
	public String toString() {
		return "Watch [ID=" + ID + ", Name=" + Name + ", Category=" + Category + ", Brand=" + Brand + ", Shape=" + Shape
				+ ", Style=" + Style + ", WatchBrandMaterial=" + WatchBrandMaterial + ", Stock=" + Stock
				+ ", StockListingDate=" + StockListingDate + ", StockUpdateDate=" + StockUpdateDate + ", price=" + price
				+ ", Discount=" + Discount + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public CategoryType getCategory() {
		return Category;
	}

	public void setCategory(CategoryType category) {
		Category = category;
	}

	public BrandType getBrand() {
		return Brand;
	}

	public void setBrand(BrandType brand) {
		Brand = brand;
	}

	public ShapeType getShape() {
		return Shape;
	}

	public void setShape(ShapeType shape) {
		Shape = shape;
	}

	public StyleType getStyle() {
		return Style;
	}

	public void setStyle(StyleType style) {
		Style = style;
	}

	public WatchMaterialType getWatchBrandMaterial() {
		return WatchBrandMaterial;
	}

	public void setWatchBrandMaterial(WatchMaterialType watchBrandMaterial) {
		WatchBrandMaterial = watchBrandMaterial;
	}

	public double getStock() {
		return Stock;
	}

	public void setStock(double stock) {
		Stock = stock;
	}

	public LocalDate getStockListingDate() {
		return StockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		StockListingDate = stockListingDate;
	}

	public LocalDate getStockUpdateDate() {
		return StockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		StockUpdateDate = stockUpdateDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return Discount;
	}

	public void setDiscount(double discount) {
		Discount = discount;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

		
	
}
