package com.assignment.me.the_office_listview;

import android.opengl.Visibility;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    //listview.setVisibility(View.GONE); so the listView disappears when it starts

    int[] employee_pics_resource = {R.drawable.jim, R.drawable.pam,
        R.drawable.scott, R.drawable.shrute, R.drawable.creed, R.drawable.stanley,
        R.drawable.malone, R.drawable.toby};
    String[] employee_names;
    String[] occupations;
    EmployeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView)findViewById(R.id.list_view);
        employee_names = getResources().getStringArray(R.array.employee_names);
        occupations = getResources().getStringArray(R.array.occupations);
        ScrollView scroll_contents = (ScrollView)findViewById(R.id.scroll);
        getLayoutInflater().inflate(R.layout.content_main,scroll_contents);

        int i = 0;
        adapter = new EmployeeAdapter(getApplicationContext(),R.layout.listrow_layout);
        listview.setAdapter(adapter);
        for(String names : employee_names)
        {
            EmployeeDataProvider dataProvider = new EmployeeDataProvider(employee_pics_resource[i],
                    names, occupations[i]);
            adapter.add(dataProvider);
            i++;
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
