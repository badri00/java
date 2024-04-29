package Stock;

import java.io.Serializable;
import java.time.LocalDate;

public class Stock implements Serializable {
	String StockId;
	String StockName;
	String CompanyName;
	double Price;
	LocalDate ClosingDate;
	int Quantity;

	public Stock(String stockId, String stockName, String companyName, double price, LocalDate closingDate,
			int quantity) {
		super();
		StockId = stockId;
		StockName = stockName;
		CompanyName = companyName;
		Price = price;
		ClosingDate = closingDate;
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "Stock [StockId=" + StockId + ", StockName=" + StockName + ", CompanyName=" + CompanyName + ", Price="
				+ Price + ", ClosingDate=" + ClosingDate + ", Quantity=" + Quantity + "]";
	}

	public String getStockId() {
		return StockId;
	}

	public void setStockId(String stockId) {
		StockId = stockId;
	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		StockName = stockName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public LocalDate getClosingDate() {
		return ClosingDate;
	}

	public void setClosingDate(LocalDate closingDate) {
		ClosingDate = closingDate;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

}
