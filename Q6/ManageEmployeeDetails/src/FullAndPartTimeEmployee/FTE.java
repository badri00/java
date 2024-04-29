package FullAndPartTimeEmployee;

import java.time.LocalDate;

public class FTE extends Emp {
	//Name, Date of joining, Phone Number, Aadhaar number  
	double MonthlySalary;

	public FTE(String name, LocalDate dateOfJoining, String phNumber, String aadhaarNumber, double monthlySalary) {
		super();
		id++;
		EmpId=id;
		Name = name;
		DateOfJoining = dateOfJoining;
		PhNumber = phNumber;
		AadhaarNumber = aadhaarNumber;
		MonthlySalary = monthlySalary;
	}
	
	
	@Override
	public String toString() {
		return "FTE [EmpId=" + EmpId + ", Name=" + Name + ", DateOfJoining=" + DateOfJoining + ", PhNumber="
				+ PhNumber + ", AadhaarNumber=" + AadhaarNumber + ", MonthlySalary=" + MonthlySalary + "]";
	}
	
	
	public int getEmpId() {
		return EmpId;
	}
	
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public LocalDate getDateOfJoining() {
		return DateOfJoining;
	}
	
	public void setDateOfJoining(LocalDate dateOfJoining) {
		DateOfJoining = dateOfJoining;
	}
	
	public String getPhNumber() {
		return PhNumber;
	}
	
	public void setPhNumber(String phNumber) {
		PhNumber = phNumber;
	}
	
	public String getAadhaarNumber() {
		return AadhaarNumber;
	}
	
	public void setAadhaarNumber(String aadhaarNumber) {
		AadhaarNumber = aadhaarNumber;
	}
	
	public double getMonthlySalary() {
		return MonthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		MonthlySalary = monthlySalary;
	}
	
}

