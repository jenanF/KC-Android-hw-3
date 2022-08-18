package com.example.myhw3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class shopAdapter extends ArrayAdapter {

    List<Products> myList;

    public shopAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        myList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.products_layout,parent, false);

       Products pro = myList.get(position);

        TextView prName = view.findViewById(R.id.name);
        TextView Pnumber = view.findViewById(R.id.number);
        ImageView photo = view.findViewById(R.id.itemimages);
        Button del = view.findViewById(R.id.button3);



        prName.setText(pro.getProName());
        Pnumber.setText( String.valueOf(pro.getProPrice())+" kd");
        photo.setImageResource(pro.getProImage());

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                remove(pro);

                Snackbar snackbar = Snackbar.make(view,"item has been deleted", Snackbar.LENGTH_LONG);
                snackbar.show();


            }
        });

        return view;




    }


}
