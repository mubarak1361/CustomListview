package com.example.uimockupdesign.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class MyListAdapter extends ArrayAdapter<Item> {

    public enum RowType {
        LIST_ITEM, HEADER_ITEM
    }

    private List<Item> items;

    public MyListAdapter(Context context, List<Item> items) {
        super(context, 0, items);
        this.items = items;
    }

    @Override
    public int getViewTypeCount() {
        return RowType.values().length;

    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getViewType();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    	
        return items.get(position).getView(convertView, position);
    }
}