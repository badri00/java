package Utils;

import static com.core.pens.PenBrand.CELLO;
import static com.core.pens.PenBrand.PARKER;
import static com.core.pens.PenMaterial.PLASTIC;
import static com.core.pens.PenMaterial.STEEL;
import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.core.pens.Pen;
import com.core.pens.PenBrand;
import com.core.pens.PenMaterial;

import custom.exceptions.PenExceptions;

public class PenUtils {

	public static List<Pen> myPen() {

		List<Pen> list = new ArrayList<>();
		list.add(new Pen(CELLO, "Red", "Blue", PLASTIC, 200, parse("2024-04-25"), parse("2024-03-25"), 20, 0));
		list.add(new Pen(PARKER, "Blue", "Red", STEEL, 100, parse("2024-04-25"), parse("2024-03-25"), 20, 0));
		return list;
	}

	public static void UpdatePen(String brand, String material, String color, String inkColor, int quantity,
			List<Pen> plist) throws PenExceptions {
		boolean exit = false;
		for (Pen p : plist) {
			if (p.getBrand().equals(PenBrand.valueOf(brand.toUpperCase()))
					&& p.getMaterial().equals(PenMaterial.valueOf(material.toUpperCase())) && p.getColor().equals(color)
					&& p.getInkColor().equals(inkColor)) {
				p.setQuantity(quantity);
				p.setUpdateDate(now());
				p.setPercent(0.0);
				System.out.println("Pen after updating quantity is:");
				System.out.println(p);
				exit = true;
			}
		}
		if (exit == false)
		throw new PenExceptions("Enter the right details!!!");

	}

	public static void SetDiscount(List<Pen> plist) {

		for (Pen p : plist) {
			if (now().minusMonths(3).isAfter(p.getUpdateDate())) {
				p.setPercent(20);
				p.setPrice(p.getPrice() * 0.8);

			}
		}
		System.out.println("Pens after discount are:");
		for (Pen p : plist)
			System.out.println(p);

	}

	public static void RemovePen(List<Pen> plist) {
		System.out.println("Pens removed are:");
		// List<Pen
		Iterator<Pen>itr=plist.iterator();
		while(itr.hasNext())
		{  
			Pen p=itr.next();
			if (now().minusMonths(9).isAfter(p.getUpdateDate())) {
				itr.remove();
				System.out.println(p);
			}
			
			
		}
//		

		}
	

	}

