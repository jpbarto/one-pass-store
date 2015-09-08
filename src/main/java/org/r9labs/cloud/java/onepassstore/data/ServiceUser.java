package org.r9labs.cloud.java.onepassstore.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "user")
@XmlType(propOrder = { "username", "firstname", "lastname", "email", "defaultGroup" })
public class ServiceUser {
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private RecordGroup defaultGroup;

	{
		defaultGroup = new RecordGroup();
	}

	@XmlElement
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@XmlElement
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElement
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlElement
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement
	public RecordGroup getDefaultGroup() {
		return defaultGroup;
	}

	public void setDefaultGroup(RecordGroup defaultGroup) {
		this.defaultGroup = defaultGroup;
	}

}
