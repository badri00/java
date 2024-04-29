package CustomException;

@SuppressWarnings("serial")
public class ItemException extends Exception {
	public ItemException(String errmsg) {
		super(errmsg);
	}
}
