package Tester;

import static utils.CricketerUtils.NewRating;
import static utils.CricketerUtils.myList;
import static utils.CricketerUtils.searchByName;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.dac.cricketer.Cricketer;

import utils.CricketerSortByRating;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<Cricketer> clist = myList();
			boolean exit = false;
			while (!exit) {
				System.out.println("Choice:\n1. Accpet Cricketer\n2. Modify rating\n3. Search by name\n"
						+ "4. Display all\n5. Display sorted cricketers by rating\n6. exit");
				System.out.println("Enter the choice:");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter name,age ,email id,phone,rating(1-10) of cricketer");
						clist.add(new Cricketer(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt()));
						System.out.println("Details of Cricketer added succesfully");
						break;

					case 2:
						System.out.println("Enter the email id and new rating");
						NewRating(sc.next(), sc.nextInt(), clist);
						System.out.println("Ratings updated succeffully!!!");
						break;

					case 3:
						System.out.println("Enter the name of cricketer:");
						searchByName(sc.next(), clist);
						break;

					case 4:
						System.out.println("Details of all cricketers are:");
						for (Cricketer c : clist) {
							System.out.println(c);
						}
						break;

					case 5:
						Collections.sort(clist, new CricketerSortByRating());

						for (Cricketer c : clist) {
							System.out.println(c);
						}
						break;

					case 6:
						exit = true;
						break;

					}

				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Please try again!!!!");
				}

			}

		}

	}

}
