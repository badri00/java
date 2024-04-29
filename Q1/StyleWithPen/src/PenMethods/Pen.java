package PenMethods;

import java.time.LocalDate;

import Allenum.BrandType;
import Allenum.MaterialType;

public class Pen {
	private int ID;
	private static int id = 0;
	private BrandType Brand;
	private String PenColor;
	private String InkColor;
	private MaterialType Material;
	private double Stock;
	private LocalDate StockUpdateDate;
	private LocalDate StockListingDate;
	private double Price;
	private double Discount;

	public Pen(BrandType brand, String penColor, String inkColor, MaterialType material, double stock,
			String stockUpdateDate, String stockListingDate, double price) {
		super();
		id++;
		ID = id;
		Brand = brand;
		PenColor = penColor;
		InkColor = inkColor;
		Material = material;
		Stock = stock;
		StockUpdateDate = LocalDate.parse(stockUpdateDate);
		StockListingDate = LocalDate.parse(stockListingDate);
		Price = price;

	}

	@Override
	public String toString() {
		return "Pen [ID=" + ID + ", Brand=" + Brand + ", PenColor=" + PenColor + ", InkColor=" + InkColor
				+ ", Material=" + Material + ", Stock=" + Stock + ", StockUpdateDate=" + StockUpdateDate
				+ ", StockListingDate=" + StockListingDate + ", Price=" + Price + ", Discount=" + Discount + "]";
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public BrandType getBrand() {
		return Brand;
	}

	public void setBrand(BrandType brand) {
		Brand = brand;
	}

	public String getPenColor() {
		return PenColor;
	}

	public void setPenColor(String penColor) {
		PenColor = penColor;
	}

	public String getInkColor() {
		return InkColor;
	}

	public void setInkColor(String inkColor) {
		InkColor = inkColor;
	}

	public MaterialType getMaterial() {
		return Material;
	}

	public void setMaterial(MaterialType material) {
		Material = material;
	}

	public double getStock() {
		return Stock;
	}

	public void setStock(double stock) {
		Stock = stock;
	}

	public LocalDate getStockUpdateDate() {
		return StockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		StockUpdateDate = stockUpdateDate;
	}

	public LocalDate getStockListingDate() {
		return StockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		StockListingDate = stockListingDate;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public double getDiscount() {
		return Discount;
	}

	public void setDiscount(double discount) {
		Discount = discount;
	}

}
