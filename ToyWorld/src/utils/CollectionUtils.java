package utils;

import java.util.ArrayList;
import java.util.List;
import static utils.ToyValidationRules.*;

import core.Toy;
import customExceptions.ToyException;

public class CollectionUtils {
	
	public static List<Toy> populateList() throws ToyException{
		List<Toy> tList = new ArrayList<Toy>();
		tList.add(validateAll(1, "Ball", "Cosco", "cat", "plastic", 10, "2023-06-10", "2023-02-01", 50, 0, tList));
		tList.add(validateAll(2, "Bat", "SS", "bird", "rubber", 100, "2023-10-10", "2024-02-01", 50, 0, tList));
		tList.add(validateAll(3, "Stufftoy", "cat", "cat", "plastic", 50, "2023-09-10", "2023-03-01", 50, 0, tList));
		tList.add(validateAll(4, "Mouse", "sfs", "dog", "rubber", 20, "2024-01-10", "2024-02-01", 50, 0, tList));
		tList.add(validateAll(5, "Cat", "dgd", "cat", "plastic", 10, "2024-02-10", "2023-01-01", 50, 0, tList));
		tList.add(validateAll(6, "Mobile", "sfs", "dog", "plastic", 5, "2024-03-10", "2024-02-01", 50, 0, tList));
		return tList;
	}
}
