package Populated;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import FullAndPartTimeEmployee.Emp;
import FullAndPartTimeEmployee.FTE;
import FullAndPartTimeEmployee.PTE;

public class PopulateList {
	public static List<Emp> populatelist() {
		List<Emp> emplist = new ArrayList<>();
		// FTP "Name,DateOfJoining(yyyy-MM-dd),PhNumber,AadhaarNumber,MonthlySalary"
		// PTE "Name,DateOfJoining(yyyy-MM-dd),PhNumber,AadhaarNumber,HourlyPayment"
		emplist.add(new PTE("e1", LocalDate.parse("2021-02-01"), "1111111111", "111111111111", 300));
		emplist.add(new PTE("e2", LocalDate.parse("2020-03-23"), "2222222222", "222222222222", 400));
		emplist.add(new PTE("e3", LocalDate.parse("2022-05-21"), "3333333333", "333333333333", 500));
		emplist.add(new PTE("e4", LocalDate.parse("2021-08-09"), "4444444444", "444444444444", 600));
		emplist.add(new PTE("e5", LocalDate.parse("2023-05-07"), "5555555555", "555555555555", 700));
		emplist.add(new FTE("e6", LocalDate.parse("2021-02-01"), "6666666666", "666666666666", 30000));
		emplist.add(new FTE("e7", LocalDate.parse("2020-03-23"), "7777777777", "777777777777", 40000));
		emplist.add(new FTE("e8", LocalDate.parse("2022-05-21"), "8888888888", "888888888888", 50000));
		emplist.add(new FTE("e9", LocalDate.parse("2021-08-09"), "9999999999", "999999999999", 60000));
		emplist.add(new FTE("e10", LocalDate.parse("2023-05-07"), "1010101010", "555555555555", 70000));
		return emplist;

	}
}
