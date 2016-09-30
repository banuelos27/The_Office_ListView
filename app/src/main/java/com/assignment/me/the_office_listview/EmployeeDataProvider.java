package com.assignment.me.the_office_listview;

/**
 * Created by Jose on 3/1/2016.
 */
public class EmployeeDataProvider {
    private int employee_pics_resource;
    private String employee_names;
    private String occupations;

    //constructor
    public EmployeeDataProvider(int employee_pics_resource, String employee_names,
                                String occupations)
    {
        this.setEmployee_pics_resource(employee_pics_resource);
        this.setEmployee_names(employee_names);
        this.setOccupations(occupations);
    }

    public String getOccupations() {
        return occupations;
    }

    public void setOccupations(String occupations) {
        this.occupations = occupations;
    }

    public String getEmployee_names() {

        return employee_names;
    }

    public void setEmployee_names(String employee_names) {
        this.employee_names = employee_names;
    }

    public int getEmployee_pics_resource() {

        return employee_pics_resource;
    }

    public void setEmployee_pics_resource(int employee_pics_resource) {
        this.employee_pics_resource = employee_pics_resource;
    }
}
