package com.example.ravneet.gymproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.ravneet.gymproject.Activities.AboutUs;
import com.example.ravneet.gymproject.Activities.Diet;
//import com.example.ravneet.gymproject.Activities.Nutrition;
import com.example.ravneet.gymproject.Activities.Supplements;
import com.example.ravneet.gymproject.Activities.WorkoutProgram;
import com.example.ravneet.gymproject.Activities.WorkoutTechnique;
import com.squareup.picasso.Picasso;

public class MAFitness extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView iv1,iv2,iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafitness);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        iv1 = (ImageView) findViewById(R.id.iv_img1);
        iv2 = (ImageView) findViewById(R.id.iv_img2);
        iv3 = (ImageView) findViewById(R.id.iv_img3);

        Picasso.with(this).load("https://firebasestorage.googleapis.com/v0/b/gymproject-f3667.appspot.com/o/rsz_img-20170722-wa0015.jpg?alt=media&token=86b52dd2-d12b-4cf8-a1af-505e99ea2253").fit().centerCrop().into(iv1);
        Picasso.with(this).load("https://firebasestorage.googleapis.com/v0/b/gymproject-f3667.appspot.com/o/rsz_img-20170722-wa0017.jpg?alt=media&token=10cc841d-7fdc-4a91-a958-9e354a61dfa6").fit().centerCrop().into(iv2);
        Picasso.with(this).load("https://firebasestorage.googleapis.com/v0/b/gymproject-f3667.appspot.com/o/rsz_img-20170722-wa0019.jpg?alt=media&token=93828bf6-8842-4bb5-9b78-b7a0146b0b79").fit().centerCrop().into(iv3);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mafitness, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        else if(id == R.id.action_aboutUs){
            startActivity(new Intent(MAFitness.this, AboutUs.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_diet) {
            startActivity(new Intent(MAFitness.this, Diet.class));
        } else if (id == R.id.nav_suppliments) {
            startActivity(new Intent(MAFitness.this, Supplements.class));
        } else if (id == R.id.nav_workoutProgram) {
            startActivity(new Intent(MAFitness.this, WorkoutProgram.class));
        } else if (id == R.id.nav_workoutTechnique) {
            startActivity(new Intent(MAFitness.this, WorkoutTechnique.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
