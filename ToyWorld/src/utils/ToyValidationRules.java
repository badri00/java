package utils;

import java.time.LocalDate;
import java.util.List;

import core.Toy;
import customExceptions.ToyException;
import enums.Material;
import enums.Species;

public class ToyValidationRules {
	
	private static final int minStock;
	private static final double minPrice;
	private static final double defaultDiscount;
	private static final double minDiscount;
	
	static {
		minStock = 0;
		minPrice = 0;
		defaultDiscount = 0;
		minDiscount = 0;
	}
	
	

	public static Toy validateAll(int toyID, String name, String brand,String targetSpecies, String material, int stockAvailable, String stockListingDate, String stockUpdateDate, double price, double discount, List<Toy> toyList) throws ToyException {
		int tempStock = validateStock(stockAvailable);
		double tempPrice = validatePrice(price);
		double tempDiscount = defaultDiscount;
		Species tempSpecies = validateAndParseSpecies(targetSpecies);
		Material tempMaterial = validateAndParseMaterial(material);
		int tempID = validateToyID(toyID, toyList);
		
		Toy tempToy = new Toy(tempID, name, brand, tempSpecies, tempMaterial, tempStock, LocalDate.parse(stockListingDate), LocalDate.parse(stockUpdateDate), tempPrice, tempDiscount);
		
		return tempToy;
	}
	
	
	public static int validateStock(int stock) throws ToyException {
		if(stock < minStock) {
			throw new ToyException("Stock cannot be negative !!");
		}
		return stock;
	}
	
	public static double validatePrice(double price) throws ToyException {
		if(price < minPrice) {
			throw new ToyException("Price cannot be negative !!");
		}
		return price;
	}
	
	public static double validateDiscount(double discount) throws ToyException {
		if(discount < minDiscount) {
			throw new ToyException("Discount cannot be negative !!");
		}
		return discount;
	}
	
	public static Species validateAndParseSpecies(String species) {
		return Species.valueOf(species.toUpperCase());
	}
	
	public static Material validateAndParseMaterial(String material) {
		return Material.valueOf(material.toUpperCase());
	}
	
	public static int validateToyID(int toyId, List<Toy> toyList) throws ToyException {
		Toy t = new Toy(toyId);
		if(toyList.contains(t)) {
			throw new ToyException("Toy ID already present !!");
		}
		return toyId;
	}
	
	public static int idAvailableOrNot(int id, List<Toy> tList) throws ToyException {
		Toy t = new Toy(id);
		if(!tList.contains(t)) {
			throw new ToyException("Toy ID invalid !!");
		}
		return id;
	}
	
	
	
}
