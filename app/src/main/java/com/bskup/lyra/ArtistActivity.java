package com.bskup.lyra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Find views for click listeners
        Button libraryButton = (Button) findViewById(R.id.artist_library_button);
        Button lyricsButton = (Button) findViewById(R.id.artist_lyrics_button);
        Button settingsButton = (Button) findViewById(R.id.artist_settings_button);
        Button albumButton = (Button) findViewById(R.id.artist_album_button);
        Button homeButton = (Button) findViewById(R.id.artist_home_button);

        // Add click listeners here
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(ArtistActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        lyricsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lyricsIntent = new Intent(ArtistActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(ArtistActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(ArtistActivity.this, MainActivity.class);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });

    }
}
