package CricketerMain;

import static Populate.PopulateList.populatelist;
import static Validation.CricketerValidation.*;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import CricketerMethods.Cricketers;
import Custom_Exception.CricketersException;

public class CricketerMain {
	public static void main(String[] args) {
		boolean exit = false;
		List<Cricketers>cktlist = populatelist();
		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				try {
					System.out.println("Your option are : ");
					System.out.println("1.Add Cricketer\n2.Modify Cricketer's rating\n"
							+ "3.Search Cricketer by name\n4.Display all Cricketers added in collection\n"
							+ "5.Display All Cricketers in sorted form by rating\n0.Exit");
					System.out.println("Enter your option: ");
					switch (sc.nextInt()) {
					case 1://Add Cricketer
						System.out.println("Enter player info");
						System.out.println("Name,Age,Email_id,Phone,Rating");
						Cricketers cricketer = ValidateInpute(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),cktlist);
						cktlist.add(cricketer);
						break;
					case 2://Modify Cricketer's rating
						System.out.println("Enter player email_id to change the rating");
						String email = sc.next();
						for(Cricketers c: cktlist) {
							if(c.getEmail_id().equals(email)){
								System.out.println("Enter New Rating : ");
								c.setRating(sc.nextInt());
								System.out.println(c);
							}else {
								throw new CricketersException("Invalid Email_Id...");
							}
						}
						break;
					case 3://Search Cricketer by name
						System.out.println("Enter the Cricketer name");
						String name = sc.next();
						for(Cricketers c: cktlist) {
							if(c.getName().equals(name)) {
								System.out.println(c);
							}else {
								throw new CricketersException("Invalid Name....");
							}
						}
						break;
					case 4://Display all Cricketers added in collection
						for(Cricketers c:cktlist) {
							System.out.println(c);
						}
						break;
					case 5://Display All Cricketers in sorted form by rating
						Collections.sort(cktlist, new SortbyRating());
						for(Cricketers c: cktlist) {
							System.out.println(c);
						}
						break;
					case 0://Exit
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Please retry.....");
				}

			}
		}
	}

}
