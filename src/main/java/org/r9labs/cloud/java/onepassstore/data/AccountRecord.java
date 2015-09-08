package org.r9labs.cloud.java.onepassstore.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "account")
@XmlType(propOrder = { "name", "username", "password", "host", "note" })
public class AccountRecord {
	private String name;
	private String username;
	private String password;
	private String host;
	private String note;

	{
		name = "";
		username = "";
		password = "";
		host = "";
		note = "";
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@XmlElement
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlElement
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@XmlElement
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
