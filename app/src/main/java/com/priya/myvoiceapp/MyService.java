package com.priya.myvoiceapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class MyService extends Service {
    private MediaPlayer mMediaPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate(){
        Toast.makeText(this, "Playing Chainsmoker's Closer", Toast.LENGTH_SHORT).show();

        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.music);
        mMediaPlayer.setLooping(false);
    }

    public void onStart(Intent intent, int startid){
        Toast.makeText(this, "Song Started", Toast.LENGTH_SHORT).show();
        mMediaPlayer.start();
    }

    public void onDestroy(){
        Toast.makeText(this, "song stopped", Toast.LENGTH_SHORT).show();
        mMediaPlayer.stop();
    }
}
