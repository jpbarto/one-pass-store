package org.r9labs.cloud.java.onepassstore.data;

public class ServiceUser {
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private RecordGroup defaultGroup;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public RecordGroup getDefaultGroup() {
		return defaultGroup;
	}

	public void setDefaultGroup(RecordGroup defaultGroup) {
		this.defaultGroup = defaultGroup;
	}

}
