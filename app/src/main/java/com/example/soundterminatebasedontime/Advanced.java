package com.example.soundterminatebasedontime;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Advanced extends AppCompatActivity {

    // Create and set MediaPlayer to car_alarm sound file
    final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.car_alarm);

    // Finds the buttons in xml and creates a object in java for use
    Button playCarAlarmFull = (Button) findViewById(R.id.button_car_alarm_full);
    Button playCarAlarmFiveSeconds = (Button) findViewById(R.id.button_car_alarm_five_seconds);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        // Calls buttonClicks method
        buttonClicks();
    }

    // Calls buttonClickHandlers
    public void buttonClicks() {

        // Calls buttonMethods
        playCarAlarmFull();
        playCarAlarmFiveSeconds();
    }

    public void playCarAlarmFull() {
        // Plays car alarm sound file. If sound is already being played the method restarts the sound
        playCarAlarmFull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.start();
            }
        });
    }

    // Plays five seconds of the car alarm sound file. If sound is already being played the method restarts the sound
    public void playCarAlarmFiveSeconds() {
        playCarAlarmFiveSeconds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.start();
            }
        });
    }

}

// Use  mp.start();mp.reset();mp.prepare();mp.start()
    /*
Handler handler = new Handler(){
    @Override
    public void handleMessage(Message msg){
        mpsound.stop();
    }
};

//Task for timer to execute when time expires
class SleepTask extends TimerTask {
    @Override
    public void run(){
        handler.sendEmptyMessage(0);
    }
}

//then in some other function...
Timer timer = new Timer("timer",true);
timer.schedule(new SleepTask(),2000);
*/