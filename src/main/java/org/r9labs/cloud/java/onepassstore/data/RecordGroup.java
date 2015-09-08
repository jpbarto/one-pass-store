package org.r9labs.cloud.java.onepassstore.data;

import java.util.ArrayList;

public class RecordGroup {
	private ArrayList<AccountRecord> records;
	private ArrayList<RecordGroup> subgroups;
	
	{
		records = new ArrayList<> ();
		subgroups = new ArrayList<> ();
	}
}
