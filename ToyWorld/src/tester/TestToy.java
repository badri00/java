package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static utils.ToyValidationRules.*;

import core.Toy;
import customExceptions.ToyException;
import utils.CollectionUtils;


public class TestToy {
	public static void main(String[] args) throws ToyException {
		try(Scanner sc = new Scanner(System.in)){
			List<Toy> toyList = CollectionUtils.populateList();
			System.out.println("List populated");
			boolean flag = false;
			while(!flag) {
				try {
					System.out.println("Enter the choice: \n"
							+ "1 -> Add a new Toy \n"
							+ "2 -> Update stock of a Toy \n"
							+ "3 -> Set discount of 15% for all the toys which are 1 year old \n"
							+ "4 -> Remove Toys which are never sold once listed in last 12 months \n"
							+ "5 -> Display all stock \n"
							+ "0 -> Exit");
					switch (sc.nextInt()) {
					
					case 1:
						System.out.println("Enter ToyID, ToyName, Brand, TargetSpecies[Cat,Dog,Bird], Material[Plastic,Rubber], Stock, StockListingDate, StockUpdateDate, Price");
						Toy t = validateAll(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), 0, toyList);
						toyList.add(t);
						System.out.println("Toy added successfully !!");
					break;
					
					case 2:
						System.out.print("Enter the Toy ID and the updated stock");
						int tempId = idAvailableOrNot(sc.nextInt(), toyList);
						int updateStock = validateStock(sc.nextInt());
						for(int i=0; i<toyList.size(); i++) {
							if(toyList.get(i).getToyID() == tempId) {
								toyList.get(i).setStockAvailable(updateStock);
							}
						}
						System.out.println("Stock updated successfully !!");
					break;
					
					case 3:
						for(int i=0; i<toyList.size(); i++) {
							
							
							if(Period.between(toyList.get(i).getStockListingDate(), LocalDate.now()).getYears()>1) {
								toyList.get(i).setDiscount(15);
							}
						}
						System.out.println("Discount updated successfully !!");	
					break;
					
					case 4:
						for(int i=0; i<toyList.size(); i++) {
							if(Period.between(toyList.get(i).getStockListingDate(), LocalDate.now()).getYears()>1) {
								toyList.remove(i);
							}
						}
						System.out.println("Stock removed successfully !!");
						
					break;
					
					case 5:
						toyList.stream().forEach(s -> System.out.println(s));
						break;
					
					case 0:
						flag = true;
						System.out.println("Closing the App !!");
					break;
					
					default:
						break;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
