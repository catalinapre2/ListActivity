package de.vogella.android.listactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MyListActivity extends ListActivity {
	
	public static final String LOG_TAG = "Tag: Catalina";
	
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		String[] values = new String[] { "Android", "iPhone", "WindowsMobile", "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2"};	
		MyPerformanceArrayAdapter adapter = new MyPerformanceArrayAdapter(this, values);
		setListAdapter(adapter);
		
	}


	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		Toast.makeText(this, item + " selected", Toast.LENGTH_LONG).show();
	}
}