package com.tipcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class Tipr extends Activity implements OnSeekBarChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipr);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tipr, menu);
        return true;
    }

    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
    	// TODO Auto-generated method stub
    }
    

    public void onStartTrackingTouch(SeekBar seekBar) {
    	// TODO Auto-generated method stub
    }
    

    public void onStopTrackingTouch(SeekBar seekBar) {
    	// TODO Auto-generated method stub
    }


}
