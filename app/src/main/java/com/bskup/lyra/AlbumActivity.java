package com.bskup.lyra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Find views for click listeners
        Button libraryButton = (Button) findViewById(R.id.album_library_button);
        Button lyricsButton = (Button) findViewById(R.id.album_lyrics_button);
        Button settingsButton = (Button) findViewById(R.id.album_settings_button);
        Button artistButton = (Button) findViewById(R.id.album_artist_button);
        Button homeButton = (Button) findViewById(R.id.album_home_button);

        // Add click listeners here
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(AlbumActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        lyricsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lyricsIntent = new Intent(AlbumActivity.this, LyricsActivity.class);
                startActivity(lyricsIntent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(AlbumActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(AlbumActivity.this, MainActivity.class);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });

    }
}
