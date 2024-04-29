package Tester;

import static PenValidations.Validations.ValidatePen;
import static Utils.PenUtils.RemovePen;
import static Utils.PenUtils.SetDiscount;
import static Utils.PenUtils.UpdatePen;
import static Utils.PenUtils.myPen;
import static Utils.IOutils.storePenDetails;
import java.util.List;
import java.util.Scanner;

import com.core.pens.Pen;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			List<Pen> plist = myPen();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Choose:\n1. Add new Pen\n2. Update stock\n3. Set discount\n4. Remove pen once listed in 9 months\n5. Display all\n6. exit");
				System.out.println("Enter choice:");

				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println(
								"Enter brand(cello,parker,reynolds,trimax),color,inkcolor,material(gold,silver,plastic,steel),stock,stock listing date,price");
						Pen stylepen = ValidatePen(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(),
								sc.nextDouble(), plist);
						plist.add(stylepen);
						System.out.println("Pen is added!!!!");
						break;

					case 2:
						System.out.println("Enter brand,material,color,inkcolor,new quantity");
						UpdatePen(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), plist);
						System.out.println("Pen stock quantity is succesfully updated!!!");
						break;

					case 3:
						SetDiscount(plist);
						System.out.println("Discount applied succefully!!!");
						break;

					case 4:
						RemovePen(plist);
						System.out.println("Pens are removed succesfully!!!");
						break;

					case 5:
						System.out.println("All the pens are:");
						for (Pen p : plist)
							System.out.println(p);
						break;

					case 6:
						exit = true;
						break;
					}
				} catch (Exception e) {

					System.out.println(e);

				}
			}
			System.out.println("Enter file name:");
	         storePenDetails(plist,sc.next());

		}
		
	}

}
