package PetMethods;

import Allenum.CategoryType;

public class PetData {
	private int PetId;
	private String Name;
	private CategoryType Category;
	private int UnitPrice;
	private int Stock;
	
	public PetData(int petId, String name, CategoryType category, int unitPrice, int stock) {
		super();
		PetId = petId;
		Name = name;
		Category = category;
		UnitPrice = unitPrice;
		Stock = stock;
	}

	@Override
	public String toString() {
		return "PetData [PetId=" + PetId + ", Name=" + Name + ", Category=" + Category + ", UnitPrice=" + UnitPrice
				+ ", Stock=" + Stock + "]";
	}

	public int getPetId() {
		return PetId;
	}

	public void setPetId(int petId) {
		PetId = petId;
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

	public int getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	
	
	
}
