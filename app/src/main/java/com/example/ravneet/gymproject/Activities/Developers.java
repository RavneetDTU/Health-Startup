package com.example.ravneet.gymproject.Activities;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ravneet.gymproject.R;

public class Developers extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.developers);
        View divyaang=(TextView) findViewById(R.id.divyaang);
        View ravneet=(TextView) findViewById(R.id.ravneet);

        divyaang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchKey = "https://www.linkedin.com/in/divyaang-a-a46574104/";
                Intent search = new Intent(Intent.ACTION_WEB_SEARCH);
                search.putExtra(SearchManager.QUERY, searchKey);
                startActivity(search);
            }
        });

        ravneet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchKey = "https://www.linkedin.com/in/ravneet-punia-83a231149/";
                Intent search = new Intent(Intent.ACTION_WEB_SEARCH);
                search.putExtra(SearchManager.QUERY, searchKey);
                startActivity(search);
            }
        });


    }
}
