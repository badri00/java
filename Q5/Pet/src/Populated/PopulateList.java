package Populated;

import static Allenum.CategoryType.CAT;
import static Allenum.CategoryType.DOG;
import static Allenum.CategoryType.FISH;
import static Allenum.CategoryType.RABBIT;
import static Allenum.StatusType.COMPLETED;
import static Allenum.StatusType.IN_PROCESS;
import static Allenum.StatusType.PLACED;

import java.util.ArrayList;
import java.util.List;

import PetMethods.PetData;
import PetMethods.PetOrder;

public class PopulateList {
	public static List<PetData>populatedatalist(){
		List<PetData> petlist = new ArrayList<>();
							//petId,name,category,unitPrice,Stock
							//CAT, DOG, RABBIT, FISH;
		petlist.add(new PetData(101, "A", CAT, 1000, 20));
		petlist.add(new PetData(102, "B", DOG, 2000, 10));
		petlist.add(new PetData(103, "C", RABBIT, 1500, 30));
		petlist.add(new PetData(104, "D", FISH, 2500, 40));
		petlist.add(new PetData(105, "E", FISH, 3000, 50));
		petlist.add(new PetData(106, "F", RABBIT, 3500, 20));
		petlist.add(new PetData(107, "G", DOG, 4000, 25));
		petlist.add(new PetData(108, "H", CAT, 4500, 15));
		return petlist;
	}
	
	public static List<PetOrder>populateorderlist(){
		List<PetOrder>orderlist = new ArrayList<>();
								//petId,quantity,status
								//PLACED, IN_PROCESS, COMPLETED;
		orderlist.add(new PetOrder(101, 4, PLACED));
		orderlist.add(new PetOrder(102, 5, IN_PROCESS));
		orderlist.add(new PetOrder(103, 6, COMPLETED));
		orderlist.add(new PetOrder(104, 7, PLACED));
		orderlist.add(new PetOrder(105, 3, IN_PROCESS));
		orderlist.add(new PetOrder(106, 4, PLACED));
		orderlist.add(new PetOrder(107, 8, COMPLETED));
		
		return orderlist;
	} 
}
