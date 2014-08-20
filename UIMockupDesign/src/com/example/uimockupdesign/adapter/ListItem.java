package com.example.uimockupdesign.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.uimockupdesign.R;
import com.example.uimockupdesign.adapter.MyListAdapter.RowType;

	public class ListItem implements Item {
		
	    private final String         place;
	    private final String 			about;
	    private final LayoutInflater inflater;
	    private final int icon;
	    private final int bg;

	    public ListItem(LayoutInflater inflater,int icon,int bg, String place,String about) {
	        this.icon =icon;
	    	this.place = place;
	        this.about =about;
	        this.inflater = inflater;
	        this.bg=bg;

	    }

	    @Override
	    public int getViewType() {
	        return RowType.LIST_ITEM.ordinal();
	    }

	    @Override
	    public View getView(View convertView,int position) {
	        if (convertView == null) {
	            convertView = (View) inflater.inflate(R.layout.list_item, null);
	        }
	        ImageView dispic =(ImageView)convertView.findViewById(R.id.icon);
	        TextView itemplace = (TextView) convertView.findViewById(R.id.place); 
	        TextView itemabout = (TextView)convertView.findViewById(R.id.street);
	      
	        dispic.setImageResource(icon);
	        dispic.setBackgroundResource(bg);
	        itemplace.setText(place);
	        itemabout.setText(about);

	        return convertView;
	    }

		
	}


