package com.example.uimockupdesign.adapter;

import android.view.View;

public interface Item {
    public int getViewType();
    public View getView(View convertView,int position);
}
