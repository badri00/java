package TaskMethodes;

import java.time.LocalDate;
import static Allenum.StatusType.*;
import Allenum.StatusType;

public class Task implements Comparable<Task>{
	private static int id=0;
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private StatusType status=PENDING;
	private boolean active=true;
	
	public Task(String taskName, String description, String taskDate, StatusType status,boolean active) {
		super();
		id++;
		this.taskId = id;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = LocalDate.parse(taskDate);
		this.status = status;
		this.active = active;
	}
	public Task(String taskName, String description, String taskDate) {
		super();
		id++;
		this.taskId = id;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = LocalDate.parse(taskDate);
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	@Override
	public int compareTo(Task o) {
		if(this.taskDate.isBefore(o.taskDate)) {
			return -1;
		}if(this.taskDate.isEqual(o.taskDate)) {
			return 0;
		}
		return 1;
	}
	
	
	
	
}
