package Statement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Account.Account;

public class Statement {
	public static void main(String[] arge) throws IOException {
		List<Account> allData = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("Jan2023.txt"));
		while (br.ready()) {
			String[] arr = br.readLine().split(",", 0);
			Account newData = new Account(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]));
			allData.add(newData);
		}
		boolean exit = false;
		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("Your option are :");
				System.out.println("1.Display all on consol\n2.Sum of all deposits\n"
						+ "3.Max deposit amount\n4.Shopping expenses (sum of withdrawals for shopping)\n"
						+ "5.Date on which maximum amount withdrawn\n0.Exit");

				try {
					switch (sc.nextInt()) {
					case 1:// Display all on consol
						for (Account a : allData) {
							System.out.println(a);
						}
						break;
					case 2:// Sum of all deposits
						double AllDeposit = 0;
						for (Account a : allData) {
							AllDeposit = AllDeposit + a.getDepositAmount();
						}
						System.out.println("all deposit value is : " + AllDeposit);
						break;
					case 3: // Max deposit amount
						double max = 0;
						for (Account a : allData) {
							if (a.getDepositAmount() > max) {
								max = a.getDepositAmount();
							}
						}
						System.out.println("Max deposit amount :" + max);

						// same with Iterator
//					double max1 = 0;
//					Iterator<Account> it = allData.iterator();
//					
//					while(it.hasNext()) {
//						Account a = it.next();
//						if(a.getDepositAmount()>max1) {
//							max1 = a.getDepositAmount();
//						}
//					}
//					System.out.println("Max1 value is :"+max1);

						break;
					case 4:// Shopping expenses (sum of withdrawals for shopping)
						double WAmount = 0;
						String s = "Shopping";
						for (Account a : allData) {
							if(a.getNarration().equals(s)) {
							WAmount = WAmount + a.getWithdrawalAmount();
							}
						}
						System.out.println("sum of withdrawals for shopping : " + WAmount);
						break;
					case 5:// Date on which maximum amount withdrawn
						double WA = 0;
						String date = "";
						for (Account a : allData) {
							if (a.getWithdrawalAmount() > WA) {
								WA = a.getWithdrawalAmount();
								date = a.getTransactionDate();
							}
						}
						System.out.println("Date on which maximum amount withdrawn : " + date);
						break;
					case 0:// Exit
						exit = true;
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
