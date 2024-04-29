package Item;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Item implements Serializable,Comparable<Item>{
	private String ItemCode;
	private String Description;
	private double Price;
	private LocalDate ShipmentDate;
	
	
	public Item(String itemCode, String description, double price, LocalDate shipmentDate) {
		super();
		ItemCode = itemCode;
		Description = description;
		Price = price;
		ShipmentDate = shipmentDate;
	}
	
	
	@Override
	public String toString() {
		return "Item [ItemCode=" + ItemCode + ", Description=" + Description + ", Price=" + Price + ", ShipmentDate="
				+ ShipmentDate + "]";
	}
	
	
	public String getItemCode() {
		return ItemCode;
	}
	
	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setDescription(String description) {
		Description = description;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setPrice(double price) {
		Price = price;
	}
	
	public LocalDate getShipmentDate() {
		return ShipmentDate;
	}
	
	public void setShipmentDate(LocalDate shipmentDate) {
		ShipmentDate = shipmentDate;
	}

	//Natural sort
	@Override
	public int compareTo(Item o) {
		return this.ItemCode.compareTo(o.ItemCode);
		/*
		 * if(this.id>o.id){
		 * return -1;
		 * if(this.id==o.id)
		 * return 0;
		 * return 1;
		 */
	}
	
	
	
}


