package EmployeeMain;

import static Populated.PopulateList.populatelist;
import static Validation.Validations.ValidateInputeFTE;
import static Validation.Validations.ValidateInputePTE;
import static Validation.Validations.ValidatrAadhaarNumber;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import FullAndPartTimeEmployee.Emp;

public class main {

	public static void main(String[] args) {
		boolean exit = false;
		List<Emp> emplist = populatelist();
		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("Your option are :");
				System.out
						.println("1.Add full time employee\n2.Add part time employee\n3.Delete an employee by Emp Id\n"
								+ "4.Search employee details by Aadhaar number\n5.Display all employee details\n"
								+ "6.Display all employee details sorted by date of joining\n0.Exit");
				System.out.println("Enter the Option : ");

				try {
					switch (sc.nextInt()) {
					case 1:// Add full time employee
						System.out.println("Name,DateOfJoining(yyyy-MM-dd),PhNumber,AadhaarNumber,MonthlySalary");
						Emp p = ValidateInputeFTE(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), emplist);
						emplist.add(p);
						System.out.println("Add full time employee Sucessfull");
						break;

					case 2:// Add part time employee
						System.out.println("Name,DateOfJoining(yyyy-MM-dd),PhNumber,AadhaarNumber,HourlyPayment");
						Emp f = ValidateInputePTE(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), emplist);
						emplist.add(f);
						System.out.println("Add part time employee Sucessfull");
						break;

					case 3:// Delete an employee by Emp Id
						System.out.println("Enter the Emp Id to Delete the Employee");
						int id = sc.nextInt();
						Iterator<Emp> it = emplist.iterator();
						while (it.hasNext()) {
							Emp e = it.next();
							if (e.getEmpId() == id) {
								it.remove();
								System.out.println(e);
							}
						}
						break;

					case 4:// Search employee details by Aadhaar number
						System.out.println("Enter Aadhaar number :");
						String AadhaarNo = ValidatrAadhaarNumber(sc.next());

						for (Emp e : emplist) {
							if (e.getAadhaarNumber().equals(AadhaarNo)) {
								System.out.println(e);
							}
						}
						break;

					case 5:// Display all employee details
						for (Emp e : emplist) {
							System.out.println(e);
						}
						break;

					case 6:// Display all employee details sorted by date of joining
						for (Emp e : emplist) {
							System.out.println(e);
						}
						break;

					case 0:// Exit
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Please retry...");
				}
			}
		}

	}

}
