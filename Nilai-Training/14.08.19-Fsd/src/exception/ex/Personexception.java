package exception.ex;

public class Personexception extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2920920052921209379L;
   public String message;
public Personexception() {
	super();
}


public Personexception(String message) {
	super();
	this.message = message;
}


public void setMessage(String message) {
	this.message = message;
}

public String getMessage() {
	return message;
}
   
}
