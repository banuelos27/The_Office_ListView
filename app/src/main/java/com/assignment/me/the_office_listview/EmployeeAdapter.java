package com.assignment.me.the_office_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jose on 3/2/2016.
 */
public class EmployeeAdapter extends ArrayAdapter {
    List list = new ArrayList();
    public EmployeeAdapter(Context context, int resource) {
        super(context, resource);
    }
    static class DataHandler{
        ImageView picture;
        TextView name;
        TextView occupation;
    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);
    }
    @Override
    public int getCount() {
        return this.list.size();
    }
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
        //will return all objects in a list
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
            row = convertView;
            DataHandler handler;
        if(convertView == null){
            //if row does not exist
            LayoutInflater inflater = (LayoutInflater)this.getContext().getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.listrow_layout, parent, false);
            handler = new DataHandler();
            //handler.name of variable in this class
            //R.id.name of listrow_layout id (check to make sure)
            handler.picture = (ImageView)row.findViewById(R.id.employee_pics);
            handler.name = (TextView)row.findViewById(R.id.employee_name);
            handler.occupation = (TextView)row.findViewById(R.id.occupation);
            row.setTag(handler);
        }
        else{
            handler = (DataHandler)row.getTag();
        }
        EmployeeDataProvider dataProvider;
        dataProvider = (EmployeeDataProvider)this.getItem(position);
        //get functions being called from the EmployeeDataProvider class
        handler.picture.setImageResource(dataProvider.getEmployee_pics_resource());
        handler.name.setText(dataProvider.getEmployee_names());
        handler.occupation.setText(dataProvider.getOccupations());

        return row;
    }
}
