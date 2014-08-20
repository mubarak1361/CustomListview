package com.example.uimockupdesign;

import java.util.ArrayList;
import java.util.List;

import com.example.uimockupdesign.adapter.Header;
import com.example.uimockupdesign.adapter.Item;
import com.example.uimockupdesign.adapter.ListItem;
import com.example.uimockupdesign.adapter.MyListAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {
	private ListView list;
	private List<Item> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        list =(ListView)findViewById(android.R.id.list);
        items =new ArrayList<Item>();
        LayoutInflater i = LayoutInflater.from(this);
        
        items.add(new Header(i, "December 5,2013"));
        items.add(new ListItem(i,R.drawable.monitor,R.drawable.iconbg1, "Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new ListItem(i,R.drawable.tick,R.drawable.iconbg2, "WhoSay", "900, Broadway, 11:29 PM"));
        items.add(new ListItem(i,R.drawable.monitor,R.drawable.iconbg2, "Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new ListItem(i,R.drawable.ring,R.drawable.iconbg1, "WhoSay", "900, Broadway, 11:29 PM"));
        items.add(new ListItem(i,R.drawable.monitor,R.drawable.iconbg2, "Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new ListItem(i,R.drawable.tick,R.drawable.iconbg1, "Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new Header(i, "October 3,2013"));
        items.add(new ListItem(i,R.drawable.ring,R.drawable.iconbg2, "Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new ListItem(i,R.drawable.tick, R.drawable.iconbg1,"Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new ListItem(i,R.drawable.monitor,R.drawable.iconbg2, "Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new ListItem(i,R.drawable.tick, R.drawable.iconbg2,"Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new ListItem(i,R.drawable.ring,R.drawable.iconbg1, "Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        items.add(new ListItem(i,R.drawable.monitor,R.drawable.iconbg2,"Brooklyn Borough Hall", "209, Joralemon St, 6:40 PM"));
        
        MyListAdapter adapter = new MyListAdapter(this, items);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        
    }
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		switch (arg2) {
		case 1:
			
			break;

		default:
			break;
		}
		
	}
}
