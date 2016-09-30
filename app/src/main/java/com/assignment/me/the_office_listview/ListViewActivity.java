package com.assignment.me.the_office_listview;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Jose on 3/18/2016.
 */
public class ListViewActivity extends ListActivity {
    String classNames[] = {"MainActivity","secondActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,classNames));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String openCLass = classNames[position];
        try{
            Class selected = Class.forName("com.assignment.me.the_office_listview." + openCLass);
            Intent selectedIntent = new Intent(this,selected);
            startActivity(selectedIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}


