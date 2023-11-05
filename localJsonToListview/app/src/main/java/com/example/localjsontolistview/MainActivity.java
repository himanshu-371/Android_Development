package com.example.localjsontolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String json_string = "{\n" +
            "  \"title\":\"JSONParserTutorial\",\n" +
            "  \"array\":[\n" +
            "    {\n" +
            "      \"company\": \"Google\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"company\": \"Facebook\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"company\": \"LinkedIn\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"company\": \"Microsoft\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"company\": \"Apple\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"nested\":{\n" +
            "    \"flag\": true,\n" +
            "    \"random_number\":1\n" +
            "  }\n" +
            "}";

    //for json viewer
//    {
//        "title": "JSONParserTutorial",
//            "array": [
//        {
//            "company": "Google"
//        },
//        {
//            "company": "Facebook"
//        },
//        {
//            "company": "LinkedIn"
//        },
//        {
//            "company": "Microsoft"
//        },
//        {
//            "company": "Apple"
//        }
//  ],
//        "nested": {
//        "flag": true,
//                "random_number": 1
//    }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //Getting JSON Objects
        try{

            //Storing items in a List
            List<String> items = new ArrayList<>();

            //Creating JSON Object
            JSONObject root_obj = new JSONObject(json_string);

            //Setting Title
            this.setTitle(root_obj.getString("title"));

            //Getting data from array
            JSONArray array = root_obj.getJSONArray("array");

            //Loop to get all company details/object
            for(int i = 0; i< array.length(); i++){
                JSONObject object = array.getJSONObject(i);
                items.add(object.getString("company"));
            }

            //creating adapter
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

            if(listView != null){
                listView.setAdapter(adapter);
            }

            //Getting Nested Objects from the root
            JSONObject nested = root_obj.getJSONObject("nested");
            Log.d("TAG", "flag value"+nested.getBoolean("flag"));

        }catch (Exception e){
            e.printStackTrace();
        }






    }
}