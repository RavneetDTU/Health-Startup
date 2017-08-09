package com.example.ravneet.gymproject.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ravneet.gymproject.R;

import java.util.ArrayList;

public class Diet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ArrayList<String> diet=new ArrayList<String>();
        diet.add("MALE");
        diet.add("12 Week Shredded Program");
        diet.add("Lean Mass Gain Program");
        diet.add("Muscular Gain Program");
        diet.add("Ketogenic Diet");
        diet.add("Carb Cycle");
        diet.add("Low Carb High Protein Diet");
        diet.add("");
        diet.add("FEMALE");
        diet.add("Zero Figue Diet");
        diet.add("12 Hour Diet");
        diet.add("8 Hour Diet");
        diet.add("Moon Diet");

        Adapter adapter=new Adapter(this,diet);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
