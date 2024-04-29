package Populate;

import java.util.ArrayList;
import java.util.List;
import static Allenum.StatusType.*;
import TaskMethodes.Task;

public class PopulateList {
	public static List<Task>populateList(){
		List<Task> tasklist = new ArrayList<>();
							//taskName,description,taskDate
		//PENDING,INPROGRESS,COMPLETED
		tasklist.add(new Task("T1", "abc1", "2024-04-19", COMPLETED, true));
		tasklist.add(new Task("T2", "abc2", "2024-04-20", INPROGRESS, true));
		tasklist.add(new Task("T3", "abc3", "2024-04-21", INPROGRESS, true));
		tasklist.add(new Task("T4", "abc4", "2024-04-22", COMPLETED, true));
		tasklist.add(new Task("T5", "abc5", "2024-04-23", PENDING, true));
		tasklist.add(new Task("T6", "abc6", "2024-04-24", PENDING, true));
		tasklist.add(new Task("T7", "abc7", "2024-04-25", COMPLETED, true));
		return tasklist;
	}
}
