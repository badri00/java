package main;

import static Populate.PopulateList.populateList;
import static Validations.PenValidations.*;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import PenMethods.Pen;

public class Main {

	public static void main(String[] args) {
		boolean exit = false;
		List<Pen>penlist = populateList();
		
		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("Option are : ");
				System.out.println("1.Add new Pen\n2.Update stock of a Pen\n"
						+ "3.Set discount of 20% for all the pens which are not at all sold in last 3 months\n"
						+ "4.Remove Pens which are never sold once listed in 9 months\n"
						+ "5.Display All list\n0.Exit");
				System.out.println("Enter your option : ");
				try {
				switch (sc.nextInt()) {
				case 1:// Add new Pen
					System.out.println("brand(CELLO, PARKER, REYNOLDS),penColor,inkColor,material(PLASTIC,ALLOY,STELL,METAL),"
										+ "stock,stockUpdateDate,stockListingDate,price");
					Pen pen = ValidationInput(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.nextInt());
					penlist.add(pen);
					System.out.println("Pen added Suscessful....");
					break;

				case 2:// Update stock of a Pen
					System.out.println("Enter pen ID you want to Update Stock :");
					int id = sc.nextInt();
					for(Pen p:penlist) {
						if(p.getID()==id) {
							System.out.println("Enter the Stock size :");
							p.setStock(sc.nextDouble());
							p.setStockUpdateDate(LocalDate.now());
							System.out.println(p);
						}
					}
					break;

				case 3:// Set discount of 20% for all the pens which are not at all sold in last 3 months
					for(Pen p:penlist) {
						if(p.getStockUpdateDate().plusMonths(3).isBefore(LocalDate.now())) {
							p.setDiscount(0.2);
							p.setPrice(p.getPrice()*p.getDiscount());
							System.out.println(p);
						}
					}
					break;
					
				case 4:// Remove Pens which are never sold once listed in 9 months
					Iterator<Pen>it = penlist.iterator();
					while(it.hasNext()) {
						Pen p = it.next();
						if(p.getStockListingDate().equals(p.getStockUpdateDate())){
							if(p.getStockListingDate().plusMonths(9).isBefore(LocalDate.now())) {
								it.remove();
								System.out.println(p);
							}
						}
						if(p.getStockUpdateDate().plusMonths(9).isBefore(LocalDate.now())) {
							it.remove();
							System.out.println(p);
						}
					}

					break;
					
				case 5:// Display All list
					for(Pen p: penlist) {
						System.out.println(p);
					}
					break;
					
				case 0:// Exit
					exit = true;

					break;

				}
				}catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
					System.out.println("Please retry...");
				}

			}
		}

	}

}
