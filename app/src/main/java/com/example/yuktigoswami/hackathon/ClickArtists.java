package com.example.yuktigoswami.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClickArtists extends AppCompatActivity {
    Button b,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_artists);
        b2 = (Button)findViewById(R.id.register);
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1;
                        i1= new Intent(ClickArtists.this,Clicklogin.class);
                        startActivity(i1);

                    }
                }
        );
        b = (Button)findViewById(R.id.login);
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1;
                        i1= new Intent(ClickArtists.this,Profile.class);
                        startActivity(i1);

                    }
                }
        );

    }
}
