package CustomException;

@SuppressWarnings("serial")
public class StockcException extends Exception {
	public StockcException(String errmsg) {
		super(errmsg);
	}
}
