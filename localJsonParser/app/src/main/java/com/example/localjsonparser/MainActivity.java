package com.example.localjsonparser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView textViewName, textViewSalary;

    //JSON String
    String JSON_STRING = "{\"employee\":{\"name\":\"Himanshu\",\"salary\":5000000}}";

    String name;
    int salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewSalary = findViewById(R.id.textViewSalary);
        textViewName = findViewById(R.id.textViewName);


        try {
            //Getting JSON Objects
            JSONObject obj = new JSONObject(JSON_STRING);

            //Fetching JSON Object named employee
            JSONObject employee = obj.getJSONObject("employee");

            //Getting employee name and salary inside json object (employee)
             name = employee.getString("name");
             salary = employee.getInt("salary");

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        textViewName.setText("Name: "+name);
        textViewSalary.setText("Salary: "+salary);



    }
}