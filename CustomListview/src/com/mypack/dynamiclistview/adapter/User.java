package com.mypack.dynamiclistview.adapter;

import android.view.LayoutInflater;
import android.view.View;

import com.mypack.dynamiclistview.R;
import com.mypack.dynamiclistview.adapter.MyListAdapter.RowType;

public class User implements Item {

    private final LayoutInflater inflater;

    public User(LayoutInflater inflater) {
        this.inflater = inflater;
        
    }

    @Override
    public int getViewType() {
        return RowType.LIST_ITEM.ordinal();
    }

     @Override
    public View getView(View convertView,int position) {
        if (convertView == null) {
            // No views to reuse, need to inflate a new view
            convertView = (View) inflater.inflate(R.layout.user, null);
        }
        

        return convertView;
    }

}
