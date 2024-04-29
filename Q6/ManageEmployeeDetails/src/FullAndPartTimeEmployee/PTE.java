package FullAndPartTimeEmployee;

import java.time.LocalDate;

public class PTE extends Emp {
	// Name, Date of joining, Phone Number, Aadhaar number
	int HourlyPaymen;

	public PTE(String name, LocalDate dateOfJoining, String phNumber, String aadhaarNumber, int hourlyPaymen) {
		super();
		id++;
		EmpId = id;
		Name = name;
		DateOfJoining = dateOfJoining;
		PhNumber = phNumber;
		AadhaarNumber = aadhaarNumber;
		HourlyPaymen = hourlyPaymen;
	}

	@Override
	public String toString() {
		return "PTE [EmpId=" + EmpId + ", Name=" + Name + ", DateOfJoining=" + DateOfJoining + ", PhNumber=" + PhNumber
				+ ", AadhaarNumber=" + AadhaarNumber + ", HourlyPaymen=" + HourlyPaymen + "]";
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

	public int getHourlyPaymen() {
		return HourlyPaymen;
	}

	public void setHourlyPaymen(int hourlyPaymen) {
		HourlyPaymen = hourlyPaymen;
	}
}
