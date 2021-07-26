package app.core.exceptions;

public class EmployeeException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmployeeException() {
	}

	public EmployeeException(String message) {
		super(message);
	}

	public EmployeeException(Throwable cause) {
		super(cause);
	}

	public EmployeeException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmployeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
