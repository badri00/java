package Validation;

import java.time.LocalDate;
import java.util.List;

import CustomException.ItemException;
import Item.Item;

public class Validations {
	public static Item ValidatedInpute(String itemCode, String description, double price, String shipmentDate,
			List<Item> itemlist) throws ItemException, IllegalArgumentException {
		ValidatedItemCode(itemCode, itemlist);
		ValidateDate(shipmentDate);
		return new Item(itemCode, description, price, LocalDate.parse(shipmentDate));
	}

	public static void ValidatedItemCode(String itemCode, List<Item> itemlist) throws ItemException {
		for (Item i : itemlist) {
			if (i.getItemCode().equals(itemCode)) {
				throw new ItemException("item is already present");
			}
		}
	}

	public static void ValidateDate(String shipmentDate) throws ItemException {
		if (LocalDate.parse(shipmentDate).isAfter(LocalDate.now())) {

		} else if (LocalDate.parse(shipmentDate).equals(LocalDate.now())) {

		} else {
			throw new ItemException("Date should be afer Today Date");
		}
	}
}
