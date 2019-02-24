package com.myaquar.inventure.gymapp.Adbters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myaquar.inventure.gymapp.Models.Model_of_item;
import com.myaquar.inventure.gymapp.R;

import java.util.ArrayList;

public class Adabter_list extends ArrayAdapter {

    ArrayList<Model_of_item> mlist;



    public Adabter_list(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        mlist = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = layoutInflater.inflate(R.layout.tarinner_item, parent, false);


        ImageView imageView = convertView.findViewById(R.id.img);
        TextView textView = convertView.findViewById(R.id.txt_name);
        TextView textView1 =convertView.findViewById(R.id.txt_jop);


        imageView.setImageResource(mlist.get(position).getImage());
        textView.setText(mlist.get(position).getName());
        textView1.setText(mlist.get(position).getJop());



        return convertView;
    }
}
