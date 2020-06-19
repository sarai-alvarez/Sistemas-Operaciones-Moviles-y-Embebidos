package com.test.appenclase.Adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Toast;

import com.test.appenclase.MainActivity;
import com.test.appenclase.R;


public class MusicPlayer implements View.OnClickListener {

    MainActivity mainActivity;
    Integer audio;
    Context context;
    ViewHolder viewHolder;
    int position;

    public MusicPlayer(Context context, Integer audio, MainActivity mainActivity, ViewHolder viewHolder, int position) {
        this.audio = audio;
        this.context = context;
        this.mainActivity = mainActivity;
        this.viewHolder = viewHolder;
        this.position=position;


        _initSong();
    }

    MediaPlayer player;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btplay:
                if(position%2!=0 ){
                _clickPlay();}
                else{
                   message("No disponible en un plan FREE");
                    viewHolder.btnPlay.setEnabled(false);
                }
                 break;
            case R.id.btpause: _clickPause(); break;
            case R.id.btstop:
                message("click Stop");
                _clickStop(); break;
        }
    }

    public void _initSong() {
        if (player == null) {
            player = MediaPlayer.create(context, audio);
        }
    }

    public void _clickPlay() {


        mainActivity.StopPlaying();

        message("Reproduciendo Cancion!!");
        _initSong();
        player.start();

        viewHolder.btnPlay.setEnabled(false);
        viewHolder.btnPause.setEnabled(true);
        viewHolder.btnStop.setEnabled(true);

    }

    public void _clickPause() {
        if(player.isPlaying()) {
            message("click Pause");
            _initSong();
            player.pause();

            viewHolder.btnPlay.setEnabled(true);
            viewHolder.btnPause.setEnabled(false);
        }

    }

    public void _clickStop() {

      //  message("click Stop");
        _initSong();
        player.release();
        player = null;


        viewHolder.btnPlay.setEnabled(true);
        viewHolder.btnPause.setEnabled(false);
        viewHolder.btnStop.setEnabled(false);

    }

    public void message(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
