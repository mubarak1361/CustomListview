package com.mypack.dynamiclistview.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.mypack.dynamiclistview.R;
import com.mypack.dynamiclistview.adapter.MyListAdapter.RowType;

public class EventItem implements Item {
	
    private final String         str2;
    private final int 			str3;
    private final String 		str4;
    private final LayoutInflater inflater;

    public EventItem(LayoutInflater inflater,String text4, String text2,int text3) {
        this.str2 = text2;
        this.inflater = inflater;
        this.str4 = text4;
        this.str3 = text3;
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

        TextView Img = (TextView) convertView.findViewById(R.id.list_content1);
        TextView text2 = (TextView) convertView.findViewById(R.id.list_content2);
        
        Img.setText(str4);
        Img.setShadowLayer(3, 1, 1, Color.BLACK);
        text2.setText(str2);
        text2.setTextColor(str3);

        return convertView;
    }

}
