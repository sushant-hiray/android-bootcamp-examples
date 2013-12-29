package com.example.listdemo;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity implements OnItemClickListener {

	private ArrayAdapter<String> fruitAdapter;
	private ArrayList<String> fruits;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Lemon");
		fruits.add("Orange");

		fruitAdapter = new ArrayAdapter<String>(MainActivity.this,
				android.R.layout.simple_list_item_1, fruits);

		getListView().setAdapter(fruitAdapter);
		getListView().setOnItemClickListener(this);

	}

	@Override
	public void onItemClick(AdapterView<?> adapterView, View view,
			int position, long id) {
		Toast.makeText(MainActivity.this, "Clicked on " + fruits.get(position),
				Toast.LENGTH_SHORT).show();
7



	}
}
