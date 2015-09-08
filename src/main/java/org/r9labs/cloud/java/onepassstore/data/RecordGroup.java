package org.r9labs.cloud.java.onepassstore.data;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "group")
@XmlType(propOrder = {"records", "subgroups"})
public class RecordGroup {
	private ArrayList<AccountRecord> records;
	private ArrayList<RecordGroup> subgroups;
	
	{
		records = new ArrayList<AccountRecord> ();
		subgroups = new ArrayList<RecordGroup> ();
	}

	@XmlElement
	public ArrayList<AccountRecord> getRecords() {
		return records;
	}
	
	public void addRecord (AccountRecord record) {
		records.add(record);
	}
	
	public void removeRecord (AccountRecord record) {
		records.remove(record);
	}

	@XmlElement
	public ArrayList<RecordGroup> getSubgroups() {
		return subgroups;
	}

	public void setSubgroups(ArrayList<RecordGroup> subgroups) {
		this.subgroups = subgroups;
	}
}
