package StockMain;

import static Populated.PopulatedList.populatelist;
import static Validation.Validations.ValidationInpute;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

import CustomException.StockcException;
import Stock.Stock;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		boolean exit = false;
		String filename = "stocks.ser";
		String name = "simple.txt";
		List<Stock> stocklist = populatelist();
		try (Scanner sc = new Scanner(System.in);
				FileOutputStream fos1 = new FileOutputStream(filename); // to store in binary
				ObjectOutputStream oos1 = new ObjectOutputStream(fos1); // to store in binary

				FileWriter fos2 = new FileWriter(name); // to store in string
				BufferedWriter oos2 = new BufferedWriter(fos2); // to store in string

		) {
			while (!exit) {
				System.out.println("Your Option are :");
				System.out.println(
						"1.Add New stock in the market\n2.View Available stocks by Company\n3.Purchase stocks\n"
								+ "4.Sell Stocks\n5.Save n Exit");
				System.out.println("Enter your Option :");
				try {
					switch (sc.nextInt()) {
					case 1:// Add New stock in the market
						System.out.println("StockId,StockName,CompanyName,Price,ClosingDate,Quantity");
						Stock stock = ValidationInpute(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.nextInt());
						stocklist.add(stock);
						break;
					case 2:// View Available stocks by Company
						System.out.println("Enter Company name :");
						String Cname = sc.next();
						for (Stock s : stocklist) {
							if (Cname.equals(s.getCompanyName())) {
								System.out.println(s.getStockName() + " " + s.getQuantity());
							}
						}
						break;
					case 3:// Purchase stocks
						System.out.println("Enter Stock Id :");
						String Sid1 = sc.next();
						boolean flag=true;
						for (Stock s : stocklist) {
							if (s.getStockId().equals(Sid1)) {
								flag=false;
								System.out.println("Enter Quantity :");
								int quantity = sc.nextInt();
								if (s.getQuantity() >= quantity) {
									s.setQuantity(s.getQuantity() - quantity);
									System.out.println(s);
								} else {
									throw new StockcException("Insufficient Available Quantity");
								}
							}
						}
						if(flag) {
							throw new StockcException("Insufficient Available Quantity");
						}
						break;
					case 4:// Sell Stocks
						boolean flag1=true;
						System.out.println("Enter Stock Id :");
						String Sid2 = sc.next();
						for (Stock s : stocklist) {
							if (s.getStockId().equals(Sid2)) {
								flag=false;
								System.out.println("Enter Quantity :");
								int quantity = sc.nextInt();
								s.setQuantity(s.getQuantity() + quantity);
								System.out.println(s);
							} 
						}
						if(flag1) {
							throw new StockcException("Insufficient Available Quantity");
						}
						break;
					case 5:// Save n Exit
						for (Stock s : stocklist) {
							oos1.writeObject(s); // to store in binary
							oos2.write(s.toString() + " \n"); // to store in string

						}
						exit =true;
						break;

					}

				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
					System.out.println("Please retry...");
				}

			}
		}

	}

}
