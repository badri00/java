package Validations;

import Allenum.BrandType;
import Allenum.MaterialType;
import PenMethods.Pen;
import custom_exceptions.PenException;

public class PenValidations {
	public static Pen ValidationInput(String brand, String penColor, String inkColor, String material, double stock,
			String stockUpdateDate, String stockListingDate, double price)
			throws IllegalArgumentException, PenException {
		BrandType newbrand = ValidationBrandType(brand);
		MaterialType newmaterial = ValidationMaterialType(material);

		return new Pen(newbrand, penColor, inkColor, newmaterial, stock, stockUpdateDate, stockListingDate, price);
	}

	public static BrandType ValidationBrandType(String brand) throws IllegalArgumentException {
		return BrandType.valueOf(brand.toUpperCase());
	}

	public static MaterialType ValidationMaterialType(String material) throws IllegalArgumentException {
		return MaterialType.valueOf(material.toUpperCase());
	}
}
