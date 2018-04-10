package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.test);
        final Button play = findViewById(R.id.play);
        Button pause = findViewById(R.id.pause);

        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mediaPlayer.pause();
            }
        });
    }
}
