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
        supplements.add("Whey protein ");
        supplements.add("Isolate protein ");
        supplements.add("Concentrate protein ");
        supplements.add("Casien protein");
        supplements.add("Soya protein ");
        supplements.add("BCAA");
        supplements.add("Creatine");
        supplements.add("Fish oil");
        supplements.add("Multivitamins ");
        supplements.add("Testosterone booster ");
        supplements.add("ZMA");
        supplements.add("Mass Gainner");
        supplements.add("Lean mass gainer ");
        supplements.add("L-Arginine");
        supplements.add("Glutamine");
        supplements.add("Felxseed oil");
        supplements.add("Chromium");
        supplements.add("Cla");
        supplements.add("Taurine");
        supplements.add("Nitrix");
        supplements.add("Glucose");
        Adapter adapter=new Adapter(this,supplements);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
