package com.myaquar.inventure.gymapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myaquar.inventure.gymapp.Models.Model_of_item;
import com.myaquar.inventure.gymapp.R;

import java.util.ArrayList;

/**
 * Created by aswany on 2/25/19.
 */

public class adapter_home extends ArrayAdapter {
    ArrayList<Model_of_item> model_of_items;
    Context context;
    public adapter_home(Context context,int image , ArrayList<Model_of_item> model_of_items) {
        super(context,image ,model_of_items);
        this.model_of_items = model_of_items;
        this.context= context;
    }

    @Override
    public View getView(final int position, View convertView,  ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = layoutInflater.inflate(R.layout.home_item_lv, parent, false);

        ImageView imageView = convertView.findViewById(R.id.home_item_IV);
        TextView textView = convertView.findViewById(R.id.home_item_TitleTV);
        TextView textView1 =convertView.findViewById(R.id.home_item_DesTV);


        imageView.setImageResource(model_of_items.get(position).getImage());
        textView.setText(model_of_items.get(position).getName());
        textView1.setText(model_of_items.get(position).getJop());

        return convertView;
    }
}
