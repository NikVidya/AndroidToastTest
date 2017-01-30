package com.example.nick.a381week2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import static nick.android.utils.NickUtils.*;

public final class MainActivity extends AppCompatActivity {
    private static final String DEBUG_TAG = "Log";
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(DEBUG_TAG, "in the onCreate() method");
        nickToast("text", "short", this);
    }
    @Override
    protected void onStart(){
        super.onStart();
        nickToast("onStart", "s", this);
    }
    @Override
    protected void onResume(){
        super.onResume();
        nickToast("onResume", "s", this);
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        nickToast("onRestart", "s", this);
    }
    @Override
    protected void onPause(){
        super.onPause();
        nickToast("onPause", "s", this);
    }
    @Override
    protected void onStop(){
        super.onStop();
        nickToast("onStop", "s", this);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        nickToast("onDestroy", "s", this);
    }

    public void onClickPlay(View v){
        playSong(v, mp, R.raw.song, R.string.isPlaying, getApplicationContext());
    }
    public void onClickStop(View v){
        stopSong(v, mp, R.string.stopped, getApplicationContext());
    }
    public void onClickPause(View v){
        pauseSong(v, mp, R.string.isPaused, getApplicationContext());
    }
}
