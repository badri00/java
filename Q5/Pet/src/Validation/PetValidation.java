package Validation;

import Allenum.CategoryType;
import Allenum.StatusType;
import PetMethods.PetData;
import PetMethods.PetOrder;

public class PetValidation {
	public static PetData ValidatInputePetData(int petId, String name, String category, int unitPrice, int stock) {
		CategoryType newcategory = ValidateCategoryType(category);
		return new PetData(petId, name, newcategory, unitPrice, stock);
	}
	
	public static PetOrder ValidateInputePetOrder(int petId, int quantity) {
		//StatusType newstatus = ValidateStatusType(status);
		
		return new PetOrder(petId, quantity);
	}
	
	public static StatusType ValidateStatusType(String status) {
		return StatusType.valueOf(status.toUpperCase());
	}
	
	public static CategoryType ValidateCategoryType(String category) {
		return CategoryType.valueOf(category.toUpperCase());
	}
}

