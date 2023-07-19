package com.example.simpleadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //same types of data source.
    String [] names_arr={"Saroj","Deepak","sanjay","Sabin","Sushil","sugam","Samir","Prakas","Anisha","Rasna","Radha ","Krishna ","Roshan","Rohan","Dhiraj","Pawan","Papu","Sujan","Susiley","Saroj","Deepak","sanjay","Sabin","Sushil","sugam","Samir","Prakas","Anisha","Rasna","Radha ","Krishna ","Roshan","Rohan","Dhiraj","Pawan","Papu","Sujan","Susiley"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.list_view);

        //creating simple array adapter .it is buil in adapter .it is used for single same  types of  array .
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,R.layout.ui_view,R.id.txt_view,names_arr);
        listView.setAdapter(arrayAdapter);

    }
}