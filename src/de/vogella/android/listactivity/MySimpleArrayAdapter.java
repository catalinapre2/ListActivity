package de.vogella.android.listactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MySimpleArrayAdapter extends ArrayAdapter<String>{
	private final Context context;
	private final String[] values;
	
	public MySimpleArrayAdapter(Context context, String[] values){
		super(context, R.layout.rowlayout, values);
		this.context = context;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(values[position]);
		//change icons for Windows and iPhone
		String s = values[position];
		if(s.startsWith("Windows7") || s.startsWith("iPhone") || s.startsWith("Solaris"))
			imageView.setImageResource(R.drawable.no);
			else 
				imageView.setImageResource(R.drawable.ok);
		return rowView;
		
	}

}
