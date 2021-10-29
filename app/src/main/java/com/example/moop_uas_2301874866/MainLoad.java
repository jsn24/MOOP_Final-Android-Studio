package com.example.moop_uas_2301874866;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainLoad extends AppCompatActivity {
    String baju, warna, size;
    TextView txt1,txt2,txt3;
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_activity);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        image1 = (ImageView) findViewById(R.id.image1);

        baju = getIntent().getStringExtra("baju11");
        warna = getIntent().getStringExtra("warna11");
        size = getIntent().getStringExtra("size11");

        if(baju.endsWith("Shirt") && warna.endsWith("Blue")) {
            image1.setImageResource(R.drawable.blue_shirt);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
        else if(baju.endsWith("Shirt") && warna.endsWith("Red")){
            image1.setImageResource(R.drawable.red_shirt);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
        else if(baju.endsWith("Shirt") && warna.endsWith("Green")){
            image1.setImageResource(R.drawable.green_shirt);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
        else if(baju.endsWith("Pants") && warna.endsWith("Blue")){
            image1.setImageResource(R.drawable.blue_pants);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
        else if(baju.endsWith("Pants") && warna.endsWith("Red")){
            image1.setImageResource(R.drawable.red_pants);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
        else if(baju.endsWith("Pants") && warna.endsWith("Green")){
            image1.setImageResource(R.drawable.green_pants);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
        else if(baju.endsWith("Hat") && warna.endsWith("Blue")){
            image1.setImageResource(R.drawable.blue_hat);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
        else if(baju.endsWith("Hat") && warna.endsWith("Red")){
            image1.setImageResource(R.drawable.red_hat);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
        else if(baju.endsWith("Hat") && warna.endsWith("Green")){
            image1.setImageResource(R.drawable.green_hat);
            txt1.setText(baju);
            txt2.setText(warna);
            txt3.setText(size);
        }
    }
}
