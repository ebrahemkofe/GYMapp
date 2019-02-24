package com.myaquar.inventure.gymapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.RadioButton;

import com.myaquar.inventure.gymapp.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class AboutUS extends AppCompatActivity {
          public CircleImageView face , insta,whats,snap,twitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        face=findViewById(R.id.face);
        whats=findViewById(R.id.whats);
        insta=findViewById(R.id.insta);
        snap=findViewById(R.id.snap);
        twitter=findViewById(R.id.twitter);




    }
}
