package custom_exceptions;

@SuppressWarnings("serial")
public class PenException extends Exception{
	public PenException(String errmsg) {
		super(errmsg);
	}
}
