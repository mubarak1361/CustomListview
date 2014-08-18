package com.mypack.dynamiclistview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.mypack.dynamiclistview.R;
import com.mypack.dynamiclistview.adapter.MyListAdapter.RowType;

public class Main implements Item {

    private final LayoutInflater inflater;

    public Main(LayoutInflater inflater) {
        this.inflater = inflater;
        
    }

    @Override
    public int getViewType() {
        return RowType.HEADER_ITEM.ordinal();
    }

     @Override
    public View getView(View convertView,int position) {
        if (convertView == null) {
            // No views to reuse, need to inflate a new view
            convertView = (View) inflater.inflate(R.layout.search, null);
        }
        Button search = (Button) convertView.findViewById(R.id.search);
         EditText searchText =(EditText)convertView.findViewById(R.id.searchedit);
        
        search.setTag(position);
        search.setOnClickListener(new OnClickListener() {
        private String string;

		@Override
        public void onClick(View arg0) {
       
        }});

        return convertView;
    }

}
