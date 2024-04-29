package Tester;

import static utils.TaskUtils.DeleteTask;
import static utils.TaskUtils.DisplayPendingTask;
import static utils.TaskUtils.DisplayPendingTaskForToday;
import static utils.TaskUtils.UpdateTaskStatus;
import static utils.TaskUtils.ValidateTask;
import static utils.TaskUtils.myTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.core.task.CompareByDate;
import com.core.task.Task;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			List<Task> tlist = myTask();
			boolean exit = false;
			int choice = 0;
			while (!exit) {
				System.out.println("Choice:\n1. Add New Task\n2. Delete a Task\n3. Update a Task status\n"
						+ "4. Display all pending tasks\n5. Display all pending tasks for today\n6. Display all tasks sorted by taskDate"
						+ "\n7. exit");
				System.out.println("Enter choice:");
				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println("Enter task name,task description, date");

						Task task = ValidateTask(sc.next(), sc.next(), "PENDING", sc.next(), "true");
						tlist.add(task);
						System.out.println("Task Added Succesfully!!!");
						break;

					case 2:
						System.out.println("Enter the name of task and date to be deleted:");
						DeleteTask(sc.next(), sc.next(), tlist);
						break;
					
					case 3:
						System.out.println("Enter the name of task and date whose status to be updated:");
						UpdateTaskStatus(sc.next(), sc.next(), tlist);
						System.out.println("Task status updated succesfully!!!");
						break;
				
					case 4:
						DisplayPendingTask(tlist);
						break;
					
					case 5:
						DisplayPendingTaskForToday(tlist);
						break;

					case 6:
						
						Collections.sort(tlist,new CompareByDate());
						System.out.println("List after sorting according to date is:");
						for (Task t : tlist)
							System.out.println(t);
						break;

					case 7:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		}
	}
}
