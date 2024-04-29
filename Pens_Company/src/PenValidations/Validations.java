package PenValidations;

import java.util.List;

import com.core.pens.*;
import com.core.pens.PenBrand;
import com.core.pens.PenMaterial;

import custom.exceptions.PenExceptions;

import static com.core.pens.PenBrand.*;
import static com.core.pens.PenMaterial.*;
import static java.time.LocalDate.parse;
import java.time.LocalDate;

public class Validations {

	public static Pen ValidatePen(String brand, String color, String inkColor, String material, int stock,
			String listingDate, double price, List<Pen> plist) throws PenExceptions {
		PenBrand b = ValidateBrand(brand, plist);
		PenMaterial m = ValidateMaterial(material, plist);
		LocalDate update = parse(listingDate);

		return new Pen(b, color, inkColor, m, stock, update, parse(listingDate), price, 0.0);
	}

	public static PenBrand ValidateBrand(String brand, List<Pen> plist) throws PenExceptions {

		return PenBrand.valueOf(brand.toUpperCase());

	}

	public static PenMaterial ValidateMaterial(String material, List<Pen> plist) throws PenExceptions {

		return PenMaterial.valueOf(material.toUpperCase());

	}

}
