package com.example.audioplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonStart, buttonStop, buttonPause;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);
        buttonPause = findViewById(R.id.buttonPause);

        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mysong);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonPause.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.buttonStart:

                //start() method is used to start audio
                mediaPlayer.start();
                break;

            case R.id.buttonPause:

                //pause() method is used to pause audio
                mediaPlayer.pause();
                break;

            case R.id.buttonStop:

                //stop() method is used to stop audio
                mediaPlayer.stop();
                break;

        }

    }
}