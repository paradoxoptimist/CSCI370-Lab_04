package com.example.asynctask;

import android.os.AsyncTask;

import java.util.ArrayList;

public class StudentAsyncTask extends AsyncTask<Void,Void,ArrayList<Student>>{

    //private list_view_row.xml
    //private context??
    //       (both also go in constructor)

    @Override
    protected ArrayList<Student> doInBackground(Void... voids) {
        return null;
        //instatiate a StudentDao
        //call getAllStudents
        //return ArrayList
    }


    //onPostExecute
        //create StudentAdapte
        //set adapter to ListView

}
