package codz.she.interview.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class User {

	private String userId;
	private String userName;
	private Set<Deal> deals;
	public User() {
		userId= UUID.randomUUID().toString();
		deals = new HashSet<>();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public Set<Deal> getDeals() {
		return deals;
	}
	
	
	
	
}
