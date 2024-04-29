package Validation;

import java.time.LocalDate;
import java.util.List;

import Exception.CustomeException;
import FullAndPartTimeEmployee.Emp;
import FullAndPartTimeEmployee.FTE;
import FullAndPartTimeEmployee.PTE;

public class Validations {
	public static FTE ValidateInputeFTE(String name, String dateOfJoining, String phNumber, String aadhaarNumber,
			double monthlySalary, List<Emp> emplist) throws IllegalArgumentException, CustomeException {
		ValidatePhNumber(phNumber);
		ValidatrAadhaarNumber(aadhaarNumber);
		ValidatePhNumber(phNumber, emplist);
		ValidatrAadhaarNumber(aadhaarNumber, emplist);
		return new FTE(name, LocalDate.parse(dateOfJoining), phNumber, aadhaarNumber, monthlySalary);
	}

	public static PTE ValidateInputePTE(String name, String dateOfJoining, String phNumber, String aadhaarNumber,
			int hourlyPaymen, List<Emp> emplist) throws IllegalArgumentException, CustomeException {
		return new PTE(name, LocalDate.parse(dateOfJoining), phNumber, aadhaarNumber, hourlyPaymen);
	}

	public static String ValidatePhNumber(String phNumber) throws CustomeException {
		if (phNumber.matches("^[0-9]{10}$")) {
			return phNumber;
		} else {
			throw new CustomeException("Phone number should be all numeric and of length 10...");
		}
	}

	public static String ValidatrAadhaarNumber(String aadhaarNumber) throws CustomeException {
		if (aadhaarNumber.matches("^[0-9]{12}$")) {
			return aadhaarNumber;
		} else {
			throw new CustomeException(
					"Aadhaar number should be all numeric and of length 12 only, there should not be any space in between...");
		}
	}

	public static void ValidatePhNumber(String phNumber, List<Emp> emplist) throws CustomeException {
		for (Emp e : emplist) {
			if (e.getPhNumber().equals(phNumber)) {
				throw new CustomeException("Phone Number is Already Exist");
			}
		}
	}

	public static void ValidatrAadhaarNumber(String aadhaarNumber, List<Emp> emplist) throws CustomeException {
		for (Emp e : emplist) {
			if (e.getAadhaarNumber().equals(aadhaarNumber)) {
				throw new CustomeException("Aadhaar Number is Already Exist");
			}
		}
	}
}
