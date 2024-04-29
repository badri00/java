package FullAndPartTimeEmployee;

import java.time.LocalDate;

public class Emp {
	static int id = 0;
	int EmpId;
	String Name;
	LocalDate DateOfJoining;
	String PhNumber;
	String AadhaarNumber;

	public Emp() {
		super();
		EmpId = 0;
		Name = "";
		DateOfJoining = LocalDate.now();
		PhNumber = "";
		AadhaarNumber = "";
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

}
