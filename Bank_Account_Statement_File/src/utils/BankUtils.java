package utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.core.bankaccount.AccountExpense;

public class BankUtils {

	public static List<AccountExpense> myList() {

		List<AccountExpense> alist = new ArrayList<AccountExpense>();
		alist.add(new AccountExpense(10000, 0, "Salary Credit", parse("2024-04-26")));
		alist.add(new AccountExpense(0, 1000, "Mobile Recharge", parse("2024-03-22")));
		return alist;
	}

	public static int SumOfDeposits(List<AccountExpense> alist) {
		int sum = 0;
		for (AccountExpense e : alist) {
			sum = sum + e.getDepositeAmmount();

		}
		return sum;
	}

	public static int MaxDepositeAmount(List<AccountExpense> alist) {
		int max = 0;
		for (AccountExpense e : alist) {
			if (e.getDepositeAmmount() > max)
				max = e.getDepositeAmmount();

		}
		return max;
	}

	public static int SumOfShoppingExpenses(List<AccountExpense> alist) {
		int sum = 0;
		String name = " shopping";
		for (AccountExpense e : alist) {
			if (e.getNarration().equalsIgnoreCase(name)) {
				sum = sum + e.getWithDrAmmount();
			}
		}
		return sum;
	}

	public static void MaxWithdrawAmountDate(List<AccountExpense> alist) {
		int max = 0;
		int index = -1;
		for (AccountExpense e : alist) {
			if (e.getWithDrAmmount() > max)
				index = alist.indexOf(e);
		}
		System.out.println("Date of maximum withdrawal is:");
		System.out.println(alist.get(index).getDate());

	}
//	public static AccountExpense filestring(List<AccountExpense>alist){
//		
//		List<AccountExpense>list=new ArrayList<AccountExpense>(alist);
//		for(AccountExpense e:alist)
//		{
//			
//			
//		}
//	}
}
