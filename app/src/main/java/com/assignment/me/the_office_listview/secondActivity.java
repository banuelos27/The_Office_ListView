package com.assignment.me.the_office_listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class secondActivity extends AppCompatActivity {
    private static Button button;
    private ListViewActivity listView;

    MenuItem officeMenuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        OnclickButtonLisitener();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);

        return super.onCreateOptionsMenu(menu);

    }

    public void OnclickButtonLisitener(){
        button = (Button)findViewById(R.id.office_button);
        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                        public  void  onClick(View v){
                        Intent intent = new Intent("com.assignment.me.the_office_listview.MainActivity");
                        startActivity(intent);
                    }
                }
        );

    }

}
