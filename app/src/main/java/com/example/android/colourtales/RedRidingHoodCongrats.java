package com.example.android.colourtales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RedRidingHoodCongrats extends AppCompatActivity {
    Button home_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_riding_hood_congrats);

        home_button = (Button) findViewById(R.id.congrats_home);

        home_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent loginIntent = new Intent(RedRidingHoodCongrats.this, MainActivity.class);
                startActivity(loginIntent);
            }
        });


    }
}
