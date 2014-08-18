package com.mypack.dynamiclistview;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.mypack.dynamiclistview.adapter.EventItem;
import com.mypack.dynamiclistview.adapter.Header;
import com.mypack.dynamiclistview.adapter.Item;
import com.mypack.dynamiclistview.adapter.Main;
import com.mypack.dynamiclistview.adapter.MyListAdapter;
import com.mypack.dynamiclistview.adapter.User;
import com.ptr.folding.FoldingDrawerLayout;

public class MainActivity extends SherlockActivity implements OnItemClickListener,OnClickListener {
	
	private FoldingDrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ActionBarDrawerToggle mDrawerToggle;
	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	Context context; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        context=this;
		LayoutInflater i = LayoutInflater.from(this);
	     List<Item> items = new ArrayList<Item>();
		mTitle = mDrawerTitle = "Drawer Example";
		mDrawerLayout = (FoldingDrawerLayout)findViewById(R.id.drawer);
		mDrawerList = (ListView)findViewById(android.R.id.list);
		items.add(new User(i));
		items.add(new Main(i));
		items.add(new Header(i, "Languages","5"));
        items.add(new EventItem(i,"J", "Java",Color.WHITE));
        items.add(new EventItem(i,"P", "PHP",Color.WHITE));
        items.add(new EventItem(i,"R", "Ruby",Color.WHITE));
        items.add(new EventItem(i,"P", "Python",Color.WHITE));
        
        MyListAdapter adapter = new MyListAdapter(this, items);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setItemsCanFocus(true);
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		
		mDrawerToggle = new ActionBarDrawerToggle(this, 
				mDrawerLayout, 
				R.drawable.ic_drawer, 
				R.string.app_name, 
				R.string.app_name){
			
			public void onDrawerClosed(View v){
				getSupportActionBar().setTitle(mTitle);
				supportInvalidateOptionsMenu();
			}
			
			public void onDrawerOpened(View v){
				getSupportActionBar().setTitle(mDrawerTitle);
				supportInvalidateOptionsMenu();
			}
			
		};
		
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		if (savedInstanceState == null){
//			selectItem(0);
		}
		

    }
    
    private class DrawerItemClickListener implements ListView.OnItemClickListener{
		
		@Override
		public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		
			
		}
		
	}



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

    if (item.getItemId() == android.R.id.home) {

        if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
            mDrawerLayout.closeDrawer(mDrawerList);
        } else {
            mDrawerLayout.openDrawer(mDrawerList);
        }
        
    }

    return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    // Sync the toggle state after onRestoreInstanceState has occurred.
    mDrawerToggle.syncState();
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
	super.onConfigurationChanged(newConfig);
	// Pass any configuration change to the drawer toggls
	mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public void onClick(View v) {
	// TODO Auto-generated method stub
	switch (v.getId()) {
	case R.id.search:
		Toast.makeText(this, "Search", Toast.LENGTH_LONG).show();
		break;

	default:
		break;
	}
}

}
