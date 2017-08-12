package com.example.ravneet.gymproject.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ravneet.gymproject.R;

import java.util.ArrayList;

public class WorkoutTechnique extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ArrayList<String> workout =new ArrayList<String>();
        workout.add("Muscle Mind Connection");
        workout.add("Proper form of Workout ");
        workout.add("Proper stretch And Contraction Of Muscles");
        Adapter adapter=new Adapter(this,workout);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
