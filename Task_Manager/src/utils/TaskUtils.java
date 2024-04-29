package utils;

import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.core.task.CompareByDate;
import static com.core.task.CompareByDate.*;
import com.core.task.Task;

public class TaskUtils {

	public static List<Task> myTask() {

		List<Task> tlist = new ArrayList<>();
		tlist.add(new Task("Reading book", "Read 10 pages", "PENDING", parse("2024-04-26"), true));
		tlist.add(new Task("Writing", "Write an essay", "COMPLETED", parse("2024-04-23"), true));
		return tlist;

	}

	public static Task ValidateTask(String name, String description, String status, String date, String active) {
		boolean acti = true;
		if (active.equalsIgnoreCase("false"))
			acti = false;

		return new Task(name, description, status.toUpperCase(), parse(date), acti);

	}

	public static void DeleteTask(String name, String date, List<Task> tlist) {
		System.out.println("Deleted task is:");
		Iterator<Task> itr = tlist.iterator();
		while (itr.hasNext()) {
			Task t = itr.next();
			if (name.equalsIgnoreCase(t.getName()) && parse(date).isEqual(t.getDate())) {
				t.setActive(false);
				itr.remove();
				System.out.println(t);
			}

		}
		System.out.println("Task deteled succesfully!!!");
		System.out.println("List of task after deleting desired task is:");
		for (Task t : tlist)
			System.out.println(t);
	}

	public static void UpdateTaskStatus(String name, String date, List<Task> tlist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the new status:");
		String status = sc.nextLine();
		for (Task t : tlist) {
			if (name.equalsIgnoreCase(t.getName()) && parse(date).isEqual(t.getDate())) {
				t.setStatus(status.toUpperCase());
			}

		}

	}

	public static void DisplayPendingTask(List<Task> tlist) {
		System.out.println("Pending tasks are:");
		for (Task t : tlist) {
			if (t.getStatus().equals("PENDING")) {
				System.out.println(t);
			}

		}

	}
	public static void DisplayPendingTaskForToday(List<Task> tlist) {
		System.out.println("Pending tasks are:");
		for (Task t : tlist) {
			if (t.getStatus().equals("PENDING") && t.getDate().isEqual(now())) {
				System.out.println(t);
			}

		}

	}

		
	}

