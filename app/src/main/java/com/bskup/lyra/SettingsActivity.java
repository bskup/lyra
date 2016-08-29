package com.bskup.lyra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Find views for click listeners
        Button homeButton = (Button) findViewById(R.id.settings_home_button);

        // Add click listeners here
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(SettingsActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

    }
}
