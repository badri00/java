package core;

import java.time.LocalDate;
import java.util.Objects;

import enums.Material;
import enums.Species;

public class Toy {
	
	private int ToyID;
	private String name;
	private String brand;
	private Species targetSpecies;	//Species is enum
	private Material material;		//Material is enum
	private int stockAvailable;
	private LocalDate stockListingDate;
	private LocalDate stockUpdateDate;
	private double price;
	private double discount;
	
	//ToString to display the Toy
	@Override
	public String toString() {
		return "Toy [ToyID=" + ToyID + ", name=" + name + ", brand=" + brand + ", targetSpecies=" + targetSpecies
				+ ", material=" + material + ", stockAvailable=" + stockAvailable + ", stockListingDate="
				+ stockListingDate + ", stockUpdateDate=" + stockUpdateDate + ", price=" + price + ", discount="
				+ discount + "]";
	}

	
	//Hashcode method for unique ID
	@Override
	public int hashCode() {
		return Objects.hash(ToyID);
	}
	
	//Equals method to for unique ID
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return ToyID == other.ToyID;
	}

	//Constructor
	public Toy(int toyID, String name, String brand, Species targetSpecies, Material material, int stockAvailable,
			LocalDate stockListingDate, LocalDate stockUpdateDate, double price, double discount) {
		super();
		ToyID = toyID;
		this.name = name;
		this.brand = brand;
		this.targetSpecies = targetSpecies;
		this.material = material;
		this.stockAvailable = stockAvailable;
		this.stockListingDate = stockListingDate;
		this.stockUpdateDate = stockUpdateDate;
		this.price = price;
		this.discount = discount;
	}
	
	//Constructor with single argument

	public Toy(int toyID) {
		super();
		ToyID = toyID;
	}


	//Getter Setters
	public int getToyID() {
		return ToyID;
	}

	public void setToyID(int toyID) {
		ToyID = toyID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Species getTargetSpecies() {
		return targetSpecies;
	}

	public void setTargetSpecies(Species targetSpecies) {
		this.targetSpecies = targetSpecies;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public int getStockAvailable() {
		return stockAvailable;
	}

	public void setStockAvailable(int stockAvailable) {
		this.stockAvailable = stockAvailable;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}
