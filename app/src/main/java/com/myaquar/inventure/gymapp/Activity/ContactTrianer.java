package com.myaquar.inventure.gymapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.myaquar.inventure.gymapp.Adbters.Adabter_list;
import com.myaquar.inventure.gymapp.Models.Model_of_item;
import com.myaquar.inventure.gymapp.R;

import java.util.ArrayList;

public class ContactTrianer extends AppCompatActivity {

    ListView listView ;
    String names []  = {"Sophie dee","Sophie dee" ,"Sophie dee","Sophie dee"};
    String jops [] = {"Shoulder exercise","Shoulder exercise","Shoulder exercise","Shoulder exercise"};
    int image2 []= {R.drawable.trainner , R.drawable.trainner , R.drawable.trainner, R.drawable.trainner};
    Adabter_list adabter_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_trianer);
        listView = findViewById(R.id.list);

        ArrayList<Model_of_item> list = new ArrayList <Model_of_item> ();

        for (int x = 0 ; x < names.length ; x++ ){
            list.add(new Model_of_item(  image2 [x] , names [x] ,jops[x]));
        }

        adabter_list = new Adabter_list(ContactTrianer.this,R.layout.tarinner_item, list);

        listView.setAdapter(adabter_list);

    }

}
