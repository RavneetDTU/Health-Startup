package com.example.ravneet.gymproject.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ravneet.gymproject.R;

import java.util.ArrayList;

public class WorkoutProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ArrayList<String> program=new ArrayList<String>();
        program.add("High Intensity Level Training");
        program.add("Strength And Endurance Training");
        program.add("Cardiovascular");
        program.add("Balance Training");
        program.add("Circuit Training");
        program.add("Flexibility Training");
        Adapter adapter=new Adapter(this,program);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
