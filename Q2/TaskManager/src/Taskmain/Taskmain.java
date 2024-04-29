package Taskmain;

import static Populate.PopulateList.populateList;
import static Validations.ValidationsTask.ValidateInpute;
import static Validations.ValidationsTask.ValidateStatusType;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import TaskMethodes.Task;

public class Taskmain {
	public static void main(String [] args) {
		boolean exit = false;
		List<Task> tasklist = populateList();
		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				try {
					System.out.println("option are : ");
					System.out.println(
							"1.Add New Task\n2.Delete a task\n3.Update task status\n4.Display all pending tasks\n"
									+ "5.Display all pending tasks for today\n6.Display all tasks sorted by taskDate\n0.Exit");
					System.out.println("Enter your option :");
					switch (sc.nextInt()) {
					case 1:// Add New Task
						System.out.println("taskName,description,taskDate");
						Task task = ValidateInpute(sc.next(), sc.next(), sc.next());
						tasklist.add(task);
						System.out.println("Your Task add sucessfull....");
						
						break;
					case 2:// Delete a task
						System.out.println("Enter TaskID :");
						int id1 = sc.nextInt();
						for(Task t: tasklist) {
							if(t.getTaskId()==id1) {
								t.setActive(false);
								System.out.println(t);
							}
						}
						break;
					case 3:// Update task status
						System.out.println("Enter TaskID :");
						int id2 = sc.nextInt();
						for(Task t: tasklist) {
							if(t.getTaskId()==id2) {
								ValidateStatusType(sc.next());
								System.out.println(t);
							}
						}
						break;
					case 4:// Display all pending tasks
						for(Task t: tasklist) {
							if(t.getStatus().equals(ValidateStatusType("PENDING"))) {
								System.out.println(t);
							}
						}
						break;
					case 5:// Display all pending tasks for today
						for(Task t: tasklist) {
							if(t.getStatus().equals(ValidateStatusType("PENDING"))) {
								if(t.getTaskDate().equals(LocalDate.now())){
									System.out.println(t);
								}
							}
						}
						break;
					case 6:// .Display all tasks sorted by taskDate
						Collections.sort(tasklist);
						for(Task t : tasklist) {
							System.out.println(t);
							
						}
						break;
					case 0:// Exit
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("please retry....");
				}
			}
		}
	}
}
