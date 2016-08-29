package com.bskup.lyra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LyricsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        // Find views for click listeners
        Button albumButton = (Button) findViewById(R.id.lyrics_album_button);
        Button libraryButton = (Button) findViewById(R.id.lyrics_library_button);
        Button settingsButton = (Button) findViewById(R.id.lyrics_settings_button);
        Button artistButton = (Button) findViewById(R.id.lyrics_artist_button);
        Button homeButton = (Button) findViewById(R.id.lyrics_home_button);

        // Add click listeners here
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(LyricsActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(LyricsActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(LyricsActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(LyricsActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(LyricsActivity.this, MainActivity.class);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });

    }
}
