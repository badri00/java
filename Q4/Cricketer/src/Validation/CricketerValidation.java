package Validation;

import java.util.List;

import CricketerMethods.Cricketers;
import Custom_Exception.CricketersException;

public class CricketerValidation {
	public static Cricketers ValidateInpute(String name, int age, String email_id, 
			String phone, int rating,List<Cricketers>cktlist) throws IllegalArgumentException,CricketersException {
		ValidateEmail_id(email_id, cktlist);
		ValidateEmail_id(email_id);
		ValidateRating(rating);
		return new Cricketers(name, age, email_id, phone, rating);
	}
	
	public static void ValidateEmail_id(String email_id,List<Cricketers>cktlist) throws CricketersException {
		for(Cricketers c:cktlist) {
			if(c.getEmail_id().equals(email_id)) {
				throw new CricketersException("Player is already exists");
			}
		}
	}
	
	public static void ValidateEmail_id(String email_id) throws CricketersException{
		@SuppressWarnings("unused")
		boolean flag = false;
		if(email_id.contains("@")&&email_id.contains(".com")) {
			flag = true;
		}else {
			throw new CricketersException("Invalide Email.....");
		}
		
	}
	
	public static int ValidateRating(int rating) {
		if(rating>=10) {
			rating =10;
			return rating;
		}else if(rating<=0){
			rating = 0;
			return rating;
		}
		return rating;
	}
}
