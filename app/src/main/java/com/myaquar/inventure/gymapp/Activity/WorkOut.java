package com.myaquar.inventure.gymapp.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.myaquar.inventure.gymapp.Models.ModelOfWorkOut;
import com.myaquar.inventure.gymapp.Adapters.AdapterOfWorkOut;
import com.myaquar.inventure.gymapp.R;

import java.util.ArrayList;

public class WorkOut extends AppCompatActivity {


    int   []  image ={R.drawable.splash};
    String [] textday = {"sun"};
    String [] texttime = {"12"};
    String [] textexcircse = {"sdjds "};



    ListView listView ;
    ArrayAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out);


        listView = findViewById(R.id.listOfWorkOut);



        ArrayList<ModelOfWorkOut> list = new ArrayList <ModelOfWorkOut> ();

        for (int x = 0 ; x < image.length ; x++ ){
            list.add(new ModelOfWorkOut(  image [x] , textday [x] ,texttime[x],textexcircse[x] ));
        }

        adapter = new AdapterOfWorkOut(this ,R.layout.item_of_workout, list);

        listView.setAdapter(adapter);


    }
}
