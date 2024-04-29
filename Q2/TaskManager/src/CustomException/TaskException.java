package CustomException;

@SuppressWarnings("serial")
public class TaskException extends Exception {
	public TaskException(String errmsg) {
		super(errmsg);
	}
}
