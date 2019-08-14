package exception.ex;

public class AccountException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6165360194682534506L;
public String msg;
public AccountException() {
	super();
}
public AccountException(String msg) {
	super();
	this.msg = msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public String getMsg() {
	return msg;
}

}
