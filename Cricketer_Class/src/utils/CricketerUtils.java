package utils;

import java.util.ArrayList;
import java.util.List;

import com.dac.cricketer.Cricketer;

import custom_exceptions.CricketerExceptions;

public class CricketerUtils {

	public static List<Cricketer> myList() {

		List<Cricketer> clist = new ArrayList<>();
		clist.add(new Cricketer("Vivek", 23, "vivekkate1111@gmail.com", "9075350747", 10));
		clist.add(new Cricketer("Rahul", 24, "rahulpatil11@gmail.com", "9075350749", 9));

		return clist;

	}

	public static void NewRating(String email, int rate, List<Cricketer> clist) throws CricketerExceptions {
		int count = -1;
		for (Cricketer c : clist) {
			if (c.getEmailId().equals(email)) {

				c.setRating(rate);
				count++;
			}
		}
		if (count == -1)
			throw new CricketerExceptions("Enter the valid email id!!");

	}

	public static void searchByName(String name, List<Cricketer> clist) throws CricketerExceptions {
		int count = -1;
		
		for (Cricketer c : clist) {
			if (c.getName().equals(name)) {
				System.out.println("Deatils of cricketer are:");
				System.out.println(c);
				count++;
			}

		}
		if (count == -1) {
			throw new CricketerExceptions("Enter the valid name!!");
		}

	}
}
