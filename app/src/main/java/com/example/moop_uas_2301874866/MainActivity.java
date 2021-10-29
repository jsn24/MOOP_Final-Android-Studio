package com.example.moop_uas_2301874866;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1,spinner2,spinner3;
    String baju, bajuload;
    String warna, warnaload;
    String size, sizeload;
    Button viewbtn, viewbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewbtn = (Button) findViewById(R.id.viewid);
        viewbtn2 = (Button) findViewById(R.id.viewid2);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                baju = spinner1.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                warna = spinner2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                size = spinner3.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                baju = spinner1.getSelectedItem().toString();
//                warna = spinner2.getSelectedItem().toString();
//                size = spinner3.getSelectedItem().toString();

                Intent intent = new Intent(MainActivity.this, BlueShirtActivity.class);
                intent.putExtra("baju1",baju);
                intent.putExtra("warna1", warna);
                intent.putExtra("size1", size);
                startActivity(intent);

            }

            ;
        });

        viewbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bajuload = getIntent().getStringExtra("bajuu");
                warnaload = getIntent().getStringExtra("colorr");
                sizeload = getIntent().getStringExtra("ukuran");

                Intent in = new Intent(MainActivity.this,MainLoad.class);

                if(bajuload.equals("")){
                    Toast.makeText(MainActivity.this,"Belum ada riwayat save",Toast.LENGTH_LONG).show();
                }else {
                    in.putExtra("baju11", bajuload);
                    in.putExtra("warna11", warnaload);
                    in.putExtra("size11", sizeload);
                    startActivity(in);
                }
            }
        });
}}
