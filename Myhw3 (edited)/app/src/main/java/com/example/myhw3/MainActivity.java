package com.example.myhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Products> products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        Products baseball = new Products("baseball", 3.500, R.drawable.baseball);
        Products basketball = new Products("basketball", 5.00, R.drawable.basketball);
        Products birdie = new Products("birdie", 2.00, R.drawable.birdie);
        Products bicycle = new Products("bicycle", 45.00,R.drawable.cycle);
        Products football = new Products("football", 4.500, R.drawable.football);
        Products dumbbell = new Products("dumbbell", 10.00, R.drawable.kettlebell);
        Products rugby = new Products("rugby", 6.00, R.drawable.rugby);
        Products skates = new Products("skates", 25.00, R.drawable.skates);
        Products skippingrope = new Products("skipping rope", 4.00, R.drawable.skippingrope);
        Products tennisracket = new Products("tennis racket", 8.00, R.drawable.tennisracket);




        products.add(baseball);
        products.add(basketball);
        products.add(birdie);
        products.add(bicycle);
        products.add(football);
        products.add(dumbbell);
        products.add(rugby);
        products.add(skates);
        products.add(skippingrope);
        products.add(tennisracket);



        shopAdapter shopAdapter = new shopAdapter(this,0,products);

        ListView listView= findViewById(R.id.listProducts);

        listView.setAdapter(shopAdapter);




    }



}