
package com.example.soundplay;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.TimeUnit;
public class SoundoneActivity extends AppCompatActivity {
   MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstantState)
    {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_soundone);
        //Button for start
        Button B1=(Button)findViewById(R.id.start_song_id);
        //Button for pausing
        Button B2=(Button)findViewById(R.id.pause_song_id);
        //Button for stoping
        Button B4=(Button)findViewById(R.id.stop_song_id);
        //MediaPlayer instance is created
        mp=MediaPlayer.create(this,R.raw.raaz);
        B1.setOnClickListener(new View.OnClickListener() {//START and resume the media player on click
            @Override
            public void onClick(View v) {
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {//on completion the song it will show "I'm done" process
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        Toast t1 = Toast.makeText(SoundoneActivity.this, "I'm done", Toast.LENGTH_SHORT);
                        t1.show();
                    }
                });
                }
        });
        B2.setOnClickListener(new View.OnClickListener() {//PAUSE the medi player on click
            @Override
            public void onClick(View v) {
               mp.pause();
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {//stop the mediaplayer and remove the resources
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });
        //For Representing the total duration of song
        TextView tn=(TextView)findViewById(R.id.duration_song_id);
        tn.setText(TimeUnit.MILLISECONDS.toMinutes(mp.getDuration())+" min, "+TimeUnit.MILLISECONDS.toSeconds(mp.getDuration())%60+" sec");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();
        if(mp!=null)
        {
            mp.release();
            mp=null;
        }
    }

}
