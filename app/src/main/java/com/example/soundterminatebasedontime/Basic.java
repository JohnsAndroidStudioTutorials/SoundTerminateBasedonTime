package com.example.soundterminatebasedontime;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Basic extends AppCompatActivity {

    final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.car_alarm);
   Button buttonPlayCarAlarmFiveSeconds = (Button) findViewById(R.id.button_car_alarm_five_seconds);
   Button buttonAdvanced = (Button) findViewById(R.id.button_advanced);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        buttonPlayCarAlarmFiveSeconds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        buttonAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAdvanced = new Intent(Basic.this, Advanced.class);
                startActivity(intentAdvanced);
            }
        });
    }
}