package Populate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Item.Item;

public class PopulateList {
	public static List<Item> populatelist() {
		List<Item> list = new ArrayList<>();
		list.add(new Item("04d", "abc", 100, LocalDate.parse("2024-05-05")));
		list.add(new Item("03c", "qwe", 50, LocalDate.parse("2024-05-10")));
		list.add(new Item("02b", "asd", 30, LocalDate.parse("2024-05-15")));
		list.add(new Item("01a", "zxc", 150, LocalDate.parse("2024-05-20")));
		list.add(new Item("05e", "xyz", 10, LocalDate.parse("2024-05-25")));
		return list;
	}
}
