package com.bskup.lyra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // Find views for click listeners
        Button albumButton = (Button) findViewById(R.id.library_album_button);
        Button lyricsButton = (Button) findViewById(R.id.library_lyrics_button);
        Button settingsButton = (Button) findViewById(R.id.library_settings_button);
        Button artistButton = (Button) findViewById(R.id.library_artist_button);
        Button homeButton = (Button) findViewById(R.id.library_home_button);

        // Add click listeners here
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(LibraryActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        lyricsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lyricsIntent = new Intent(LibraryActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(LibraryActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(LibraryActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(LibraryActivity.this, MainActivity.class);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });

    }
}
