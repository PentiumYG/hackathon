package com.example.yuktigoswami.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Screen2 extends AppCompatActivity {
    ImageButton artists;
    ImageButton tourists;
    ImageButton eventOrganisers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        artists=(ImageButton)findViewById(R.id.artists);
        tourists=(ImageButton)findViewById(R.id.tourists);
        eventOrganisers=(ImageButton)findViewById(R.id.eventOrganisers);
        artists.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Screen2.this,ClickArtists.class);
                        startActivity(i);
                    }
                }
        );
        tourists.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent j=new Intent(Screen2.this,TouristLogin.class);
                        startActivity(j);

                    }
                }
        );
        eventOrganisers.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent k=new Intent(Screen2.this,EventOrganiser.class);
                        startActivity(k);

                    }
                }
        );

    }
}
