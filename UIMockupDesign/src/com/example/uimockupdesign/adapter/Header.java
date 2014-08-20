package com.example.uimockupdesign.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.uimockupdesign.R;
import com.example.uimockupdesign.adapter.MyListAdapter.RowType;


public class Header implements Item {
	
    private final String         dateAndTime;
    private final LayoutInflater inflater;

    public Header(LayoutInflater inflater, String dateAndTime) {
        this.dateAndTime = dateAndTime;
        this.inflater = inflater;

    }

    @Override
    public int getViewType() {
        return RowType.HEADER_ITEM.ordinal();
    }

    @Override
    public View getView(View convertView,int position) {
        if (convertView == null) {
            convertView = (View) inflater.inflate(R.layout.list_header, null);
        }

        TextView text = (TextView) convertView.findViewById(R.id.header); 
        text.setText(dateAndTime);

        return convertView;
    }

	
}
