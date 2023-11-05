package com.example.retrofitsimplejson;

public class retrofit_dataModelClass {

    //This class will be a template to data we are going to parse.

    private int userId;
    private int id;
    private String title;
    private boolean coursecompleted;   //OR     @Serializable("completed")
//                                      boolean status;                  //giving custom name status



    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCoursecompleted() {
        return coursecompleted;
    }



}
