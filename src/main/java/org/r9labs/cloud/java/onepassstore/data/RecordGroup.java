package org.r9labs.cloud.java.onepassstore.data;

import java.util.ArrayList;

public class RecordGroup {
	private ArrayList<AccountRecord> records;
	private ArrayList<RecordGroup> subgroups;
	
	{
		records = new ArrayList<AccountRecord> ();
		subgroups = new ArrayList<RecordGroup> ();
	}

	public ArrayList<AccountRecord> getRecords() {
		return records;
	}
	
	public void addRecord (AccountRecord record) {
		records.add(record);
	}
	
	public void removeRecord (AccountRecord record) {
		records.remove(record);
	}

	public ArrayList<RecordGroup> getSubgroups() {
		return subgroups;
	}

	public void setSubgroups(ArrayList<RecordGroup> subgroups) {
		this.subgroups = subgroups;
	}
}
