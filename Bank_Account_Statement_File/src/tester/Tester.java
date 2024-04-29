package tester;

import static java.time.LocalDate.parse;
import static utils.BankUtils.MaxDepositeAmount;
import static utils.BankUtils.MaxWithdrawAmountDate;
import static utils.BankUtils.SumOfDeposits;
import static utils.BankUtils.SumOfShoppingExpenses;
import static utils.BankUtils.myList;
import static utils.IOUtils.storeExpensesDetails;
import java.util.List;
import java.util.Scanner;

import com.core.bankaccount.AccountExpense;

public class Tester {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<AccountExpense> blist = myList();
			boolean exit = false;
			while (!exit) {
				System.out.println("Choice:\n1. Add expense\n2. Sum of all deposits\n3. Max deposite amount\n"
						+ "4. Shopping Expenses\n5. Date on which max amount withdrawn\n6. exit");
				System.out.println("Enter the choice:");
				try {
				switch (sc.nextInt()) {

				case 1:
					System.out.println("Enter the deposite ammount,withdrawal amount,narration,date of transaction");
					blist.add(new AccountExpense(sc.nextInt(), sc.nextInt(), sc.nextLine(), parse(sc.next())));
					System.out.println("Account expense is added!!");
					break;

				case 2:
					int sum = SumOfDeposits(blist);
					System.out.println("Sum of all deposits are:" + sum);
					break;
					
				case 3:
					int max=MaxDepositeAmount(blist);
					System.out.println("Maximum deposit amount is:" + max);
					break;
				
				case 4:
					int shopsum=SumOfShoppingExpenses(blist);
					System.out.println("Sum of all shopping expenses are:" + shopsum);
					break;
				
				case 5:
					 MaxWithdrawAmountDate(blist);
					 break;
					 
				case 6:
					exit=true;
					break;
				
				}

			}catch(Exception e)
				{
				System.out.println(e);
				}
			}
			
			storeExpensesDetails(blist,"Jan2023.txt");
		}
          
		
		
		
		
	}

}
