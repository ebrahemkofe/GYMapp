package com.myaquar.inventure.gymapp.Activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.myaquar.inventure.gymapp.Adapters.adapter_home;
import com.myaquar.inventure.gymapp.Models.Model_of_item;
import com.myaquar.inventure.gymapp.R;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView home_LV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        home_LV= findViewById(R.id.home_LV);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        setData();
    }

    private void setData() {
        String Title []  = {"Zomba","Dead Left","Cardio"};
        String desc [] = {"ShoulderShoulderShoulderShoulder_exerciseexerciseexerciseexerciseexerciseexercise",
                "ShoulderShoulderShoulderShoulderShoulderexercise","how ever you do this it`s all about abilty"};
        int images []= {R.drawable.traner , R.drawable.trainner ,R.drawable.traner};
        ArrayList<Model_of_item> MyList = new ArrayList <Model_of_item> ();

        for (int x = 0 ; x < Title.length ; x++ ){
            MyList.add(new Model_of_item(  images [x] , Title [x] ,desc[x]));
        }


        adapter_home home = new adapter_home(this,R.layout.home_item_lv, MyList);
        home_LV.setAdapter(home);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_Home) {
            Toast.makeText(this, "home", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_Profile) {
            Toast.makeText(this, "nav_Profile", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_QR_Code) {
            Toast.makeText(this, "nav_QR_Code", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_Login) {
            Toast.makeText(this, "nav_Login", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_Workout) {
            Toast.makeText(this, "nav_Workout", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_trainer_request) {
            Toast.makeText(this, "nav_trainer_request", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_about_us) {
            Toast.makeText(this, "nav_about_us", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_contact_trainer) {
            Toast.makeText(this, "nav_contact_trainer", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_logout) {
            Toast.makeText(this, "nav_logout", Toast.LENGTH_SHORT).show();

        }
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
