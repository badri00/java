package Populate;

import java.util.ArrayList;
import java.util.List;
import PenMethods.Pen;
import static Allenum.BrandType.*;
import static Allenum.MaterialType.*;

public class PopulateList {
	public static List<Pen> populateList() {
		List<Pen> list = new ArrayList<>();
		// String brand, String penColor, String inkColor, String material,
		// double stock,
		// String stockUpdateDate, String stockListingDate, int price

		// brand = CELLO, PARKER, REYNOLDS;
		// material = PLASTIC,ALLOY,STELL,METAL;
		list.add(new Pen(CELLO, "White", "Blue", PLASTIC, 10, "2022-02-02", "2022-01-01", 250));
		list.add(new Pen(PARKER, "White", "Blue", ALLOY, 15, "2024-01-04", "2023-12-01", 350));
		list.add(new Pen(REYNOLDS, "White", "Blue", STELL, 20, "2023-12-02", "2023-10-15", 150));
		list.add(new Pen(CELLO, "White", "Blue", METAL, 25, "2024-04-02", "2024-01-01", 450));
		list.add(new Pen(REYNOLDS, "White", "Blue", PLASTIC, 10, "2024-02-02", "2024-01-01", 250));
		list.add(new Pen(PARKER, "White", "Blue", ALLOY, 15, "2024-01-04", "2023-12-01", 350));
		list.add(new Pen(CELLO, "White", "Blue", STELL, 20, "2023-12-02", "2023-10-15", 150));
		list.add(new Pen(PARKER, "White", "Blue", METAL, 25, "2024-04-02", "2024-01-01", 450));
		return list;

	}
}
