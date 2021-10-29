package com.example.moop_uas_2301874866;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BlueShirtActivity extends AppCompatActivity {
    TextView textView6,textView8,textView10;
    String baju, warna, size;
    ImageView image;
    Button load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blue_shirt);

        textView6 = (TextView) findViewById(R.id.textView6);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView10 = (TextView) findViewById(R.id.textView10);
        image = (ImageView) findViewById(R.id.image);
        load = (Button) findViewById(R.id.button4);

            baju = getIntent().getStringExtra("baju1");
            warna = getIntent().getStringExtra("warna1");
            size = getIntent().getStringExtra("size1");

        if(baju.endsWith("Shirt") && warna.endsWith("Blue")) {
            image.setImageResource(R.drawable.blue_shirt);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }
        else if(baju.endsWith("Shirt") && warna.endsWith("Red")){
            image.setImageResource(R.drawable.red_shirt);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }
        else if(baju.endsWith("Shirt") && warna.endsWith("Green")){
            image.setImageResource(R.drawable.green_shirt);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }
        else if(baju.endsWith("Pants") && warna.endsWith("Blue")){
            image.setImageResource(R.drawable.blue_pants);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }
        else if(baju.endsWith("Pants") && warna.endsWith("Red")){
            image.setImageResource(R.drawable.red_pants);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }
        else if(baju.endsWith("Pants") && warna.endsWith("Green")){
            image.setImageResource(R.drawable.green_pants);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }
        else if(baju.endsWith("Hat") && warna.endsWith("Blue")){
            image.setImageResource(R.drawable.blue_hat);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }
        else if(baju.endsWith("Hat") && warna.endsWith("Red")){
            image.setImageResource(R.drawable.red_hat);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }
        else if(baju.endsWith("Hat") && warna.endsWith("Green")){
            image.setImageResource(R.drawable.green_hat);
            textView6.setText(baju);
            textView8.setText(warna);
            textView10.setText(size);
        }

        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BlueShirtActivity.this,MainActivity.class);
                i.putExtra("bajuu", baju);
                i.putExtra("colorr", warna);
                i.putExtra("ukuran", size);
                startActivity(i);
            }
        });
    }
}
