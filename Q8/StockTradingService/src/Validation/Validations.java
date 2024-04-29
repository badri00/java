package Validation;

import java.time.LocalDate;


import CustomException.StockcException;
import Stock.Stock;

public class Validations {
	public static Stock ValidationInpute(String stockId, String stockName, String companyName, double price,
			String closingDate, int quantity) throws StockcException {
		ValidateDate(closingDate);
		return new Stock(stockId, stockName, companyName, price, LocalDate.parse(closingDate), quantity);
	}
	
	public static void ValidateDate(String closingDate) throws StockcException {
		if(LocalDate.parse(closingDate).isAfter(LocalDate.now())) {
		}else {
			throw new StockcException("Date should be afer Today Date");
		}
	}
}
