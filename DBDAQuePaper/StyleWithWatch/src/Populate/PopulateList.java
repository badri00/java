package Populate;
import static Allenum.BrandType.CASIO;
import static Allenum.BrandType.TITAN;
import static Allenum.CategoryType.MEN;
import static Allenum.CategoryType.WOMEN;
import static Allenum.ShapeType.RECTANGLE;
import static Allenum.ShapeType.ROUND;
import static Allenum.ShapeType.SQUARE;
import static Allenum.StyleType.CASUAL;
import static Allenum.StyleType.SPORT;
import static Allenum.StyleType.WEDDING;
import static Allenum.WatchMaterialType.CERAMIC;
import static Allenum.WatchMaterialType.SILVER;
import static Allenum.WatchMaterialType.STEEL;

import java.util.ArrayList;

import WatchMethods.Watch;

public class PopulateList {
	public static ArrayList<Watch>populateList(){
		ArrayList<Watch>watch = new ArrayList<>();//upcasting

//		"name,category,brand,shape,style,watchBrandMaterial,stock,"
//		+ "stockListingDate,stockUpdateDate,price,discount"
		watch.add(new Watch("W1",  MEN, CASIO, SQUARE, CASUAL, CERAMIC, 10,"2024-05-23", "2024-05-23", 2000));
		watch.add(new Watch("W2",  WOMEN, TITAN, RECTANGLE, SPORT, STEEL, 15,"2022-05-23", "2023-01-20", 2200));
		watch.add(new Watch("W3",  MEN, TITAN, ROUND, WEDDING, SILVER, 20,"2023-01-02", "2024-01-04", 2500));
		watch.add(new Watch("W4",  WOMEN, CASIO, ROUND, CASUAL, STEEL, 20,"2021-11-22", "2022-12-31", 5500));
		watch.add(new Watch("W5",  MEN, CASIO, RECTANGLE, WEDDING, SILVER, 20,"2020-11-24", "2022-03-27", 3500));
		return watch;
	}
}
