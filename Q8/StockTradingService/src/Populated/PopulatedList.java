package Populated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Stock.Stock;

public class PopulatedList {
	public static List<Stock> populatelist(){
		List<Stock> slist = new ArrayList<>();
		slist.add(new Stock("a1", "a", "abc", 100, LocalDate.parse("2025-02-02"), 1000));
		slist.add(new Stock("a2", "b", "qwe", 150, LocalDate.parse("2025-03-03"), 1200));
		slist.add(new Stock("a3", "c", "asd", 200, LocalDate.parse("2025-04-04"), 1300));
		slist.add(new Stock("a4", "d", "zxc", 250, LocalDate.parse("2025-05-05"), 1400));
		slist.add(new Stock("a5", "e", "rty", 300, LocalDate.parse("2025-06-06"), 1500));
		return slist;
	}
}
