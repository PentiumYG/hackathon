package com.example.yuktigoswami.hackathon;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class TouristLogin extends AppCompatActivity {
    ViewPager viewPager;
    Button city,sanf,cah,food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_login);
         city=(Button)findViewById(R.id.city);
        sanf=(Button)findViewById(R.id.sanf);
        cah=(Button)findViewById(R.id.cah);
        food=(Button)findViewById(R.id.food);

        viewPager =(ViewPager)findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
        Timer timer =new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),3000,4000);

        city.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(TouristLogin.this,Cities.class);
                        startActivity(intent);
                    }
                }
        );
        sanf.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(TouristLogin.this,SpecialAttractionandFestivals.class);
                        startActivity(intent);
                    }
                }
        );
        cah.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(TouristLogin.this,CultureAndHistory.class);
                        startActivity(intent);
                    }
                }
        );
        food.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(TouristLogin.this,food.class);
                        startActivity(intent);
                    }
                }
        );
    }
    public class MyTimerTask extends TimerTask{


        @Override
        public void run() {
            TouristLogin.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager.getCurrentItem()==0){
                        viewPager.setCurrentItem(1);
                    }else if(viewPager.getCurrentItem()==1){
                        viewPager.setCurrentItem(2);
                    }
                    else if(viewPager.getCurrentItem()==2){
                        viewPager.setCurrentItem(3);
                    }
                    else if(viewPager.getCurrentItem()==3){
                        viewPager.setCurrentItem(4);
                    }
                    else if(viewPager.getCurrentItem()==4){
                        viewPager.setCurrentItem(5);
                    }
                    else { viewPager.setCurrentItem(0);}

                }
            });

        }
    }
}
