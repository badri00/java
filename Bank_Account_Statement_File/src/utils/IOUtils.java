package utils;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

import com.core.bankaccount.AccountExpense;

public interface IOUtils {

	static void storeExpensesDetails(List<AccountExpense> alist, String fname) {

		try (PrintWriter pw = new PrintWriter(new FileWriter(fname));) {
			System.out.println("Hello!!!!");
			String st = "WithdrawalAmount,DepositAmount,Narration,TransactionDate";
			pw.println(st);
			for (AccountExpense e : alist) {
				pw.print(e.getWithDrAmmount());
				pw.print(',');
				pw.print(e.getDepositeAmmount());
				pw.print(',');
				pw.print(e.getNarration());
				pw.print(',');
				pw.println(e.getDate().toString());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
