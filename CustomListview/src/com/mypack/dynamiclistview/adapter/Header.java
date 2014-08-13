package com.mypack.dynamiclistview.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.mypack.dynamiclistview.R;
import com.mypack.dynamiclistview.adapter.MyListAdapter.RowType;

public class Header implements Item {
    private final String         name;
    private final String 		 total;
    private final LayoutInflater inflater;

    public Header(LayoutInflater inflater, String name,String total) {
        this.name = name;
        this.inflater = inflater;
        this.total = total;
    }

    @Override
    public int getViewType() {
        return RowType.HEADER_ITEM.ordinal();
    }

    @Override
    public View getView(View convertView,int position) {
        if (convertView == null) {
            // No views to reuse, need to inflate a new view
            convertView = (View) inflater.inflate(R.layout.header, null);
        }

        TextView text = (TextView) convertView.findViewById(R.id.headerText);
        TextView count=  (TextView) convertView.findViewById(R.id.total);
        
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            // only for IceCream SandWitch and newer versions
        	
       }
        else
        {
        	text.setBackgroundColor(android.R.color.transparent);
        }
        
        text.setText(name);
        text.setShadowLayer(3, 1, 1, Color.BLACK);
        count.setText(total);

        return convertView;
    }

}
