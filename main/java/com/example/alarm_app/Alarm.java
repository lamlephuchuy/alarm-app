package com.example.alarm_app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.widget.Toast;

public class Alarm extends BroadcastReceiver{
    @Override
    public void onReceive(Context context,Intent intent){
        MediaPlayer mplayer=MediaPlayer.create(context, Settings.System.DEFAULT_NOTIFICATION_URI);
        mplayer.start();
        Toast.makeText(context,"Wake up", Toast.LENGTH_SHORT).show();
    }
}
