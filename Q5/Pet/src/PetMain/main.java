package PetMain;

import static Login.Login.Adminlogin;
import static Login.Login.Alllogin;
import static Populated.PopulateList.populatedatalist;
import static Populated.PopulateList.populateorderlist;
import static Validation.PetValidation.ValidatInputePetData;
import static Validation.PetValidation.ValidateInputePetOrder;
import static Validation.PetValidation.ValidateStatusType;

import java.util.List;
import java.util.Scanner;

import Exception.UnauthorizedException;
import PetMethods.PetData;
import PetMethods.PetOrder;

public class main {

	public static void main(String[] args) throws UnauthorizedException {
		boolean exit = false;
		List<PetData> petdata = populatedatalist();
		List<PetOrder> petorder = populateorderlist();
		/*
		 * Pet Store Application Menu: Login Add new Pet (Admin only functionality)
		 * Update Pet details (Admin only functionality) Display all available pets
		 * Order a Pet Check order status by Order Id Update order status (Admin only
		 * functionality) Exit
		 */
		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				// log in method
				System.out.println("Enter your loginId");
				String loginId = sc.next();
				System.out.println("Enter your password");
				String password = sc.next();
				if (Alllogin(loginId, password)) {
					System.out.println("Option are :");
					System.out.println(
							"1.Add new Pet\n2.Update Pet details\n3.Display all available pets\n4.Order a Pet\n"
									+ "5.Check order status by Order Id\n6.Update order status\n0.Exit");
					System.out.println("Enter your option: ");
					try {
						switch (sc.nextInt()) {
						case 1:// Add new Pet (Admin only functionality)

							if (Adminlogin(loginId, password)) {
								System.out
										.println("Enter:\nPetId,Name,Category(CAT, DOG, RABBIT, FISH),UnitPrice,Stock");
								PetData data = ValidatInputePetData(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(),
										sc.nextInt());
								petdata.add(data);
							}
							break;
						case 2:// Update Pet details (Admin only functionality)

							if (Adminlogin(loginId, password)) {
								System.out.println("Enter petid");
								int petid = sc.nextInt();
								for (PetData p : petdata) {
									if (p.getPetId() == petid) {
										System.out.println("Press\n1.updated unitprice\n2.updated Stock");
										int option = sc.nextInt();
										if (option == 1) {
											System.out.println("Enter updated unitprice");
											p.setUnitPrice(sc.nextInt());
										} else if (option == 2) {
											System.out.println("Enter updated Stock");
											int stock = sc.nextInt();
											p.setStock(p.getStock() + stock);
										} else {
											throw new UnauthorizedException("only 2 option you enter other than that");
										}
									}
								}
							}
							break;
						case 3:// Display all available pets
							if (Alllogin(loginId, password)) {
								for (PetData p : petdata) {
									if (p.getStock() > 1) {
										System.out.println(p);
									}
								}
							}
							break;
						case 4:// Order a Pet
							if (Alllogin(loginId, password)) {
								System.out.println("Enter:\nPetId,Quantity");
								int PetId = sc.nextInt();
								int Quantity = sc.nextInt();
								PetOrder order = ValidateInputePetOrder(PetId, Quantity);
								petorder.add(order);
								for (PetData p : petdata) {
									if (p.getPetId() == PetId) {
										if(Quantity<p.getStock()) {
										p.setStock(p.getStock() - Quantity);
									}else {
										throw new UnauthorizedException("Quantity is more than avalible stock"
									+"\nAvalible Stock is "+p.getStock());
									}
									}
								}
							}
							break;
						case 5:// Check order status by Order Id
							if (Alllogin(loginId, password)) {
								System.out.println("Enter your order id :");
								int id = sc.nextInt();
								for (PetOrder p : petorder) {
									if (p.getOrderId() == id) {
										System.out.println("Your Order Status is : " + p.getStatus());
									}
								}
							}
							break;
						case 6:// Update order status (Admin only functionality)
							if (Adminlogin(loginId, password)) {
								System.out.println("Enter order id to update :");
								int id1 = sc.nextInt();
								for (PetOrder p : petorder) {
									if (p.getOrderId() == id1) {
										System.out.println(p);
										System.out.println("Enter updated status :");
										p.setStatus(ValidateStatusType(sc.next()));
										System.out.println(p);
									}
								}
							}
							break;
						case 0:// Exit
							exit = true;
							break;

						}

					} catch (Exception e) {
						System.out.println(e);
						System.out.println("Please Retry....");
					}
				}
			}
		}
	}

}
