package Validations;

import Allenum.BrandType;
import Allenum.CategoryType;
import Allenum.ShapeType;
import Allenum.StyleType;
import Allenum.WatchMaterialType;
import WatchMethods.Watch;
import custom_exceptions.WatchException;

public class WatchValidations {
	
	public static Watch ValidationInputes(String name, String category, String brand, String shape, String style,
			String watchBrandMaterial, double stock, String stockListingDate, String stockUpdateDate,
			double price) throws IllegalArgumentException,WatchException {
		CategoryType newcategory = validateCategoryType(category);
		BrandType newbrand = validateBrandType(brand);
		ShapeType newshape = validateShapeType(shape);
		StyleType newstyle = validateStyleType(style);
		WatchMaterialType newwatchBrandMaterial = validateWatchMaterialType(watchBrandMaterial);
		
		return new Watch(name, newcategory, newbrand, newshape, newstyle, newwatchBrandMaterial, stock, stockUpdateDate,stockUpdateDate,price);
	}

	public static CategoryType validateCategoryType(String category) throws IllegalArgumentException {
		return CategoryType.valueOf(category.toUpperCase());
	}
	
	public static BrandType validateBrandType(String brand) throws IllegalArgumentException{
		return BrandType.valueOf(brand.toUpperCase());
	}
	
	public static ShapeType validateShapeType(String shape) throws IllegalArgumentException{
		return ShapeType.valueOf(shape.toUpperCase());
	}
	public static StyleType validateStyleType(String style) throws IllegalArgumentException{
		return StyleType.valueOf(style.toUpperCase());
	}
	public static WatchMaterialType validateWatchMaterialType(String watchBrandMaterial) throws IllegalArgumentException{
		return WatchMaterialType.valueOf(watchBrandMaterial.toUpperCase());
	}
}
