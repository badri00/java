package com.core.bankaccount;

import java.time.LocalDate;

public class AccountExpense {

	private int WithDrAmmount;
	private int DepositeAmmount;
	private String Narration;
	private LocalDate date;

	
	public AccountExpense(int depositeAmmount, int withDrAmmount, String narration, LocalDate date) {
		super();
		WithDrAmmount = withDrAmmount;
		DepositeAmmount = depositeAmmount;
		Narration = narration;
		this.date = date;
	}

	public int getWithDrAmmount() {
		return WithDrAmmount;
	}

	public void setWithDrAmmount(int withDrAmmount) {
		WithDrAmmount = withDrAmmount;
	}

	public int getDepositeAmmount() {
		return DepositeAmmount;
	}

	public void setDepositeAmmount(int depositeAmmount) {
		DepositeAmmount = depositeAmmount;
	}

	public String getNarration() {
		return Narration;
	}

	public void setNarration(String narration) {
		Narration = narration;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "AccountExpense [WithDrAmmount=" + WithDrAmmount + ", DepositeAmmount=" + DepositeAmmount
				+ ", Narration=" + Narration + ", date=" + date + "]";
	}
     
	
	
	

}
