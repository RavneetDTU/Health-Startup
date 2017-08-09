package com.example.ravneet.gymproject.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ravneet.gymproject.R;

import java.util.ArrayList;

public class Supplements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ArrayList<String> supplements=new ArrayList<String>();
        supplements.add("Protein Supplement");
        supplements.add("BCAA");
        supplements.add("Creatine");
        supplements.add("Fish Oil");
        supplements.add("Multivitamins");
        supplements.add("L-Carnitine");
        supplements.add("Testosterone Booster");
        supplements.add("ZMA");
        supplements.add("Lean Mass Gainer");
        supplements.add("L-Arginne");
        Adapter adapter=new Adapter(this,supplements);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
