package Testing11_maven.vti.enity;

public class Account {
	private int account_id;
	private String username;
	private String fullname;

	public Account() {
	}

	public Account(int accountID, String username, String fullName) {
		this.account_id = accountID;
		this.username = username;
		this.fullname = fullName;
	}

	public int getAccountID() {
		return account_id;
	}

	public String getUsername() {
		return username;
	}

	public String getFullName() {
		return fullname;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", username=" + username + ", fullname=" + fullname + "]";
	}

	

}

