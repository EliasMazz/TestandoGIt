package com.domoticenter;


import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class QuartoActivity extends Activity  {


	//LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
	ArrayList<String> listItems=new ArrayList<String>();

	//DEFINING STRING ADAPTER WHICH WILL HANDLE DATA OF LISTVIEW
	ArrayAdapter<String> adapter;
	
	//RECORDING HOW MUCH TIMES BUTTON WAS CLICKED
	int clickCounter=0;
	
	
	private ListView listView;
	
	
	@Override
	public void onCreate(Bundle icicle) {

	super.onCreate(icicle);
	setContentView(R.layout.quarto_layout);
	
	adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listItems);
	
	listView = (ListView) findViewById(R.id.list);
	listView.setAdapter(adapter);

	
	listView.setOnItemClickListener(new OnItemClickListener() {
		   public void onItemClick(AdapterView<?> adapter, View view, int position, long arg) {
			System.out.println(listView.getItemAtPosition(position));
		   } 
		});
	
	}

	//METHOD WHICH WILL HANDLE DYNAMIC INSERTION
	public void addItems(View v) {
	 listItems.add("Clicked : "+clickCounter++);
	 adapter.notifyDataSetChanged();
	}

	
}
	
	
	
