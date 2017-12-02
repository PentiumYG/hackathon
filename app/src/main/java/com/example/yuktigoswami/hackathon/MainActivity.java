package com.example.yuktigoswami.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread th = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }
                catch (Exception h){}
                finally {
                    Intent i = new Intent(MainActivity.this , Screen2.class);
                    startActivity(i);
                    finish();

                }
            }
        };
        th.start();

    }
}
