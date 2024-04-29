package PetMethods;

import Allenum.StatusType;
import static Allenum.StatusType.*;

public class PetOrder {
	private static int id=0;
	private int OrderId; 
	private int PetId; 
	private int Quantity;
	private StatusType Status;
	
	public PetOrder(int petId, int quantity, StatusType status) {
		super();
		id++;
		OrderId = id;
		PetId = petId;
		Quantity = quantity;
		Status = status;
	}
	public PetOrder(int petId, int quantity) {
		super();
		id++;
		OrderId = id;
		PetId = petId;
		Quantity = quantity;
		Status = PLACED;
	}
	@Override
	public String toString() {
		return "PetOrder [OrderId=" + OrderId + ", PetId=" + PetId + ", Quantity=" + Quantity + ", Status=" + Status
				+ "]";
	}

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public int getPetId() {
		return PetId;
	}

	public void setPetId(int petId) {
		PetId = petId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public StatusType getStatus() {
		return Status;
	}

	public void setStatus(StatusType status) {
		Status = status;
	}
	
	
}
