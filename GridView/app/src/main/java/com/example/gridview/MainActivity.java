package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gv1;
    String course []= {"Bitcoin", "Etherium", "Cardano", "Ripple", "Vechain", "Tron", "Solana", "Polkadot", "Matic", "Dogecoin", "Mana", "Theta",
                           "ChainLink", "Holo", "BAT", "Airswap" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv1=findViewById(R.id.gv1);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,course);
        gv1.setAdapter(arrayAdapter);

        //Click Event of gridView
        gv1.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(getApplicationContext(), course[position], Toast.LENGTH_SHORT).show();
            
        });
    }
}