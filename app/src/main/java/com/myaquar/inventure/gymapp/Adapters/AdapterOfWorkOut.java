package com.myaquar.inventure.gymapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.myaquar.inventure.gymapp.Models.ModelOfWorkOut;
import com.myaquar.inventure.gymapp.R;

import java.util.ArrayList;

public class AdapterOfWorkOut extends ArrayAdapter {


    private ArrayList<ModelOfWorkOut> mlist;


    public AdapterOfWorkOut(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        mlist = objects;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = layoutInflater.inflate(R.layout.item_of_workout, parent, false);

        TextView textDay = convertView.findViewById(R.id.text_day_of_work_out);
        ImageView image = convertView.findViewById(R.id.image_of_work_out);
        Button button = convertView.findViewById(R.id.button_of_work_out);
        TextView textTime = convertView.findViewById(R.id.text_time_of_work_out);
        TextView  textExercise=  convertView.findViewById(R.id.text_exercise_of_work_out);


        textDay.setText(mlist.get(position).getDay());
        textTime.setText(mlist.get(position).getTime());
        textExercise.setText(mlist.get(position).getExercise());
        image.setImageResource(mlist.get(position).getImage());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





        return convertView ;
    }
}
