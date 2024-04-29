package tester;

import static Populate.PopulateList.populateList;
import static Validations.WatchValidations.ValidationInputes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import WatchMethods.Watch;

public class WatchMain {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Watch> watchlist = populateList();
			boolean exit = false;
			while (!exit) {
				System.out.println("Option are : ");
				System.out.println("1.Add new Watch\n2.Update stock of a Watch\n"
						+ "3.Set Discount of 10% for all the Watch which are 1 year old\n"
						+ "4.Remove Watches which are never sold once listed in 18 months\n"
						+ "5.Print All Watch\n0.Exit");
				System.out.println("Enter Your Option : ");

				try {
					switch (sc.nextInt()) {
					case 1: // Add new Watch
						System.out.println(
								"name,category(MEN,WOMEN),brand(CASIO,TITAN),shape(SQUARE,RECTANGLE,ROUND),style(CASUAL,SPORT,WEDDING),\nwatchBrandMaterial(CERAMIC,STEEL,SILVER),stock,"
										+ "stockListingDate,stockUpdateDate,price");
						Watch watch = ValidationInputes(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());

//						for(Watch w: watchlist) {
//							if(w.getStockListingDate().isAfter(LocalDate.now())) {
//								w.setStockUpdateDate(w.getStockListingDate());
//								watchlist.add(watch);
//							}
//						}
						watchlist.add(watch);
						System.out.println("Add watch suscessfull");
						break;

					case 2:// Update stock of a Watch
						System.out.println("Enter ID of Watch");
						int id = sc.nextInt();
						for (Watch w : watchlist) {

							if (w.getID() == id) {
								System.out.println("Enter Stock size");
								w.setStock(sc.nextDouble());
								w.setStockUpdateDate(LocalDate.now());
								System.out.println(w);
							}
						}
						break;

					case 3: // Set Discount of 10% for all the Watch which are 1 year old
						for (Watch w : watchlist) {
							if (w.getStockUpdateDate().plusYears(1).isBefore(LocalDate.now())) {
								w.setDiscount(0.1);
								w.setPrice(w.getPrice() - (w.getPrice() * w.getDiscount()));
								System.out.println(w);
							}
						}

						break;

					case 4:// Remove Watches which are never sold once listed in 18 months
						Iterator<Watch> it = watchlist.iterator();
						while (it.hasNext()) {
							Watch w = it.next();
							if (w.getStockListingDate().plusMonths(18).isBefore(LocalDate.now())) {
								it.remove();
								System.out.println("Remove list is \n" + w);
							}

						}
						break;

					case 5: // print All
						for (Watch w : watchlist) {
							System.out.println(w);
						}
						break;

					case 0: // Exit
						exit = true;
						break;

					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
					System.out.println("Plesae retry...");
				}

			}
		}

	}

}
