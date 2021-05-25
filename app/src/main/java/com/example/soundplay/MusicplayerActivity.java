package com.example.soundplay;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.service.autofill.SaveCallback;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class MusicplayerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstantstate)
    {
     //   long int start_time=0;
        super.onCreate(savedInstantstate);
        setContentView(R.layout.activity_musicplayer);
        SeekBar s1=(SeekBar)findViewById(R.id.seekbaar_id);
        MediaPlayer mp=MediaPlayer.create(this,R.raw.raaz);
        Button b1=(Button)findViewById(R.id.back_id);
        Button b2=(Button)findViewById(R.id.forward_id);
        Button b3=(Button)findViewById(R.id.pause_id);
        Button b4=(Button)findViewById(R.id.rewind_id);
        b3.setOnClickListener(new View.OnClickListener() {   //for pausing and starting the song
            @Override
            public void onClick(View v) {
                if(mp!=null) {
                    if (mp.isPlaying()) {
                        mp.pause();
                    } else {
                        mp.start();
                    }
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {//backward
            @Override
            public void onClick(View v) {
               if(mp!=null)
               {
                   int curr_pos=mp.getCurrentPosition();
                   int const_time=5000;//5 sec
                   mp.seekTo(curr_pos-const_time);
               }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {//forward
            @Override
            public void onClick(View v) {
                if(mp!=null)
                {
                    int curr_pos=mp.getCurrentPosition();
                    int const_time=5000;
                    mp.seekTo(curr_pos+const_time);
                }

            }
        });
b3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    if(mp!=null)
    {
        mp.pause();
    }
    }
});
b4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(mp!=null)
        {
            mp.reset();
        }
    }
});
        TextView t5=(TextView)findViewById(R.id.end_time_id);
        int iol=mp.getDuration();
        String f=Integer.toString(iol);
        t5.setText(f);

    }
}
