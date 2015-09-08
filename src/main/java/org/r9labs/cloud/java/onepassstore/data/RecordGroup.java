package org.r9labs.cloud.java.onepassstore.data;

import java.util.ArrayList;

public class RecordGroup {
	private ArrayList<AccountRecord> records;
	private ArrayList<RecordGroup> subgroups;
	
	{
		records = new ArrayList<> ();
		subgroups = new ArrayList<> ();
	}

	public ArrayList<AccountRecord> getRecords() {
		return records;
	}

	public void setRecords(ArrayList<AccountRecord> records) {
		this.records = records;
	}

	public ArrayList<RecordGroup> getSubgroups() {
		return subgroups;
	}

	public void setSubgroups(ArrayList<RecordGroup> subgroups) {
		this.subgroups = subgroups;
	}
	
	
}
