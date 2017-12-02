package com.example.yuktigoswami.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cities extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Ajmer.class);
                        startActivity(intent);
                    }
                }
        );
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Alwar.class);
                        startActivity(intent);
                    }
                }
        );
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Bharatpur.class);
                        startActivity(intent);
                    }
                }
        );
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Bikaner.class);
                        startActivity(intent);
                    }
                }
        );
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Dausa.class);
                        startActivity(intent);
                    }
                }
        );
        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Jaipur.class);
                        startActivity(intent);
                    }
                }
        );
        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Jaisalmer.class);
                        startActivity(intent);
                    }
                }
        );
        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Jodhpur.class);
                        startActivity(intent);
                    }
                }
        );
        b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,kota.class);
                        startActivity(intent);
                    }
                }
        );
        b10=(Button)findViewById(R.id.button10);
        b10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,SawaiMadhopur.class);
                        startActivity(intent);
                    }
                }
        );
        b11=(Button)findViewById(R.id.button11);
        b11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,SriGanganagar.class);
                        startActivity(intent);
                    }
                }
        );
        b12=(Button)findViewById(R.id.button12);
        b12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(Cities.this,Udaipur.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
