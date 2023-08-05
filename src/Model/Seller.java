package Model;

public class Seller extends Person {
	
	private String password;
	private String type;
	
	public Seller(String fName, String lName, String emailId, String password, String state, String city, String type) {
		setfName(fName);
		setlName(lName);
		setEmailId(emailId);
		setPassword(password);
		setState(state);
		setCity(city);
		setType(type);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	void setType(String type) {
		// TODO Auto-generated method stub
		this.type = type;
	}

}
