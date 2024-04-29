package Validations;

import Allenum.StatusType;
import CustomException.TaskException;
import TaskMethodes.Task;

public class ValidationsTask {
	public static Task ValidateInpute(String taskName, String description, String taskDate) throws IllegalArgumentException,TaskException{
		//StatusType Entrystatus = ValidateStatusType();
		//StatusType newstatus = ValidateStatusType(status);
		return new Task(taskName, description, taskDate);
	}
	
//	public static StatusType ValidateStatusType() throws IllegalArgumentException{
//		return StatusType.valueOf("PENDING");
//	}
	public static StatusType ValidateStatusType(String status) throws IllegalArgumentException{
		return StatusType.valueOf(status.toUpperCase());
	}
	
}

