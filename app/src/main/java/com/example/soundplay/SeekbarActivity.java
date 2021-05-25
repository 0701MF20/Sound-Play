package com.example.soundplay;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SeekbarActivity extends AppCompatActivity {
@Override
    protected void onCreate(Bundle savedInstantState)
    {
        super.onCreate(savedInstantState);
        setContentView(R.layout.activity_seekbar);
        TextView T1=(TextView)findViewById(R.id.seekbar_textView_Id);
        SeekBar s1=(SeekBar)findViewById(R.id.seekbar_seekbar_id);
        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
            T1.setTextSize(progress+1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
    }
}
