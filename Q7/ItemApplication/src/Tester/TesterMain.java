package Tester;

import static Populate.PopulateList.populatelist;
import static Validation.Validations.ValidatedInpute;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Item.Item;

public class TesterMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		boolean exit = false;
		String Bfile1 = "items_code.ser";
		String Bfile2 = "item_price.ser";
		String Sfile1 = "items_code.txt";
		String Sfile2 = "item_price.txt";
		List<Item> itemlist = populatelist();
		try (Scanner sc = new Scanner(System.in);
				// Binary for items_code
				FileOutputStream fos1 = new FileOutputStream(Bfile1);
				ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
				// Binary for item_price
				FileOutputStream fos2 = new FileOutputStream(Bfile2);
				ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
				// String for items_code
				FileWriter fos3 = new FileWriter(Sfile1);
				BufferedWriter oos3 = new BufferedWriter(fos3);
				//String for item_price
				FileWriter fos4 = new FileWriter(Sfile2);
				BufferedWriter oos4 = new BufferedWriter(fos4);

		) {
			while (!exit) {
				System.out.println("Your Option are: ");
				System.out.println("1.Add Item\n2.Sort these details as per Item code.Store them in binary file\n"
						+ "3.Sort these details as per Item price. Store them in binary file \n4.All print\n5.Exit");
				System.out.println("Enter your Option :");
				try {
					switch (sc.nextInt()) {
					case 1:// Add Item
						System.out.println("ItemCode,Description,Price,ShipmentDate");
						Item item = ValidatedInpute(sc.next(), sc.next(), sc.nextDouble(), sc.next(), itemlist);
						itemlist.add(item);
						break;

					case 2:// Sort these details as per Item code.Store them in binary file
						Collections.sort(itemlist); // natural sorting
						for (Item i : itemlist) {
							System.out.println(i);
							oos1.writeObject(i);
							oos3.write(i.toString()+"\n");
							//oos3.write(i.toString() + "\n");
						}
						break;
					case 3:// Sort these details as per Item price. Store them in binary file
						Collections.sort(itemlist, new SortByitemPrice()); // custom sorting
						for (Item i : itemlist) {
							System.out.println(i);
							oos2.writeObject(i);
							oos4.write(i.toString()+"\n");
							//oos4.write(i.toString() + "\n");
						}
						break;
					case 4:// all print
						for (Item i : itemlist) {
							System.out.println(i);
						}
						break;
					case 5:// exit
						exit = true;
					}

				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
					System.out.println("Please retry..");
				}
			}
		}

	}

}
