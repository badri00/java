package com.core.pens;

import java.time.LocalDate;

public class Pen {

	private int id;
	private static int count;
	private PenBrand brand;
	private String color;
	private String inkColor;
	private PenMaterial material;
	private int quantity;
	private LocalDate updateDate;
	private LocalDate listDate;
	private double price;
	private double percent = 0.0;

	static {
		count = 1;
	}

	public Pen(PenBrand brand, String color, String inkColor, PenMaterial material, int quantity, LocalDate updateDate,
			LocalDate listDate, double price, double percent) {
		super();
		this.id = count++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.quantity = quantity;
		this.updateDate = updateDate;
		this.listDate = listDate;
		this.price = price;
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", quantity=" + quantity + ", updateDate=" + updateDate + ", listDate=" + listDate
				+ ", price=" + price + ", discountpercent=" + percent + "% ]";
	}

	public Pen(int quantity) {
		super();
		this.quantity = quantity;
	}

	public PenBrand getBrand() {
		return brand;
	}

	public void setBrand(PenBrand brand) {
		this.brand = brand;
	}

	public PenMaterial getMaterial() {
		return material;
	}

	public void setMaterial(PenMaterial material) {
		this.material = material;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getColor() {
		return color;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public LocalDate getListDate() {
		return listDate;
	}

	public void setListDate(LocalDate listDate) {
		this.listDate = listDate;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	public String toString1() {
		return  id + "," + brand + "," + color + "," + inkColor + ","
				+ material + "," + quantity + "," + updateDate + "," + listDate
				+ "," + price + "," + percent ;
	}
}
