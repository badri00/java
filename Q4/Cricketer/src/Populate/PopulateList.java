package Populate;

import java.util.ArrayList;
import java.util.List;

import CricketerMethods.Cricketers;

public class PopulateList {
	public static List<Cricketers>populatelist(){
		List<Cricketers>ckt=new ArrayList<>();
		ckt.add(new Cricketers("N1", 23, "N1@gamil.com", "11111111111", 6));
		ckt.add(new Cricketers("N2", 23, "N2@gamil.com", "22222222222", 5));
		ckt.add(new Cricketers("N3", 23, "N3@gamil.com", "33333333333", 7));
		ckt.add(new Cricketers("N4", 23, "N4@gamil.com", "44444444444", 8));
		ckt.add(new Cricketers("N5", 23, "N5@gamil.com", "55555555555", 9));
		ckt.add(new Cricketers("N6", 23, "N6@gamil.com", "66666666666", 6));
		ckt.add(new Cricketers("N7", 23, "N7@gamil.com", "77777777777", 5));
		ckt.add(new Cricketers("N8", 23, "N8@gamil.com", "88888888888", 7));
		ckt.add(new Cricketers("N9", 23, "N9@gamil.com", "99999999999", 8));
		return ckt;
	}
}
