package com.example.soundplay;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView v1=(TextView)findViewById(R.id.sample_1_id);
        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(MainActivity.this,SoundoneActivity.class);
                startActivity(i);
            }
        });
        TextView v2=(TextView)findViewById(R.id.sample_2_id);
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii=new Intent(MainActivity.this,SoundtwoActivity.class);
                startActivity(ii);
            }
        });
        TextView v3=(TextView)findViewById(R.id.seekbar_id);
        v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(MainActivity.this,SeekbarActivity.class);
                startActivity(i3);
            }
        });
        TextView v4=(TextView)findViewById(R.id.music_player_id);
        v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(MainActivity.this,MusicplayerActivity.class);
                startActivity(i4);
            }
        });
    }
}