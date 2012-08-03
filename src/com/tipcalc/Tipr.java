package com.tipcalc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class Tipr extends Activity implements OnSeekBarChangeListener {
	
	final static String TAG = "Tipr App";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipr);
 
        // Must be a Listener to handle an Event
        SeekBar tipPercentSB = (SeekBar) findViewById(R.id.tipPercent);
        tipPercentSB.setOnSeekBarChangeListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tipr, menu);
        return true;
    }

    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
    	TextView tipPercent = (TextView) findViewById(R.id.labelPercent);
    	tipPercent.setText(progress + " %");
    	Log.d(TAG, "Progress change called - from THIS listener");
    	TextView tipAmt = (TextView) findViewById(R.id.tipAmt);
    	EditText billAmt = (EditText) findViewById(R.id.billBox);
    	TextView totalBill = (TextView) findViewById(R.id.totalAmt);
    	double bill = Double.parseDouble(billAmt.getText().toString());
    	double tipTotal = (progress / 100.0) * (bill);
    	double total = bill + tipTotal;
    	tipAmt.setText("$" + String.format("%.2f",tipTotal));
    	totalBill.setText("$" + String.format("%.2f", total));
    	
    }
    

    public void onStartTrackingTouch(SeekBar seekBar) {
    	// TODO Auto-generated method stub
    }
    

    public void onStopTrackingTouch(SeekBar seekBar) {
    	// TODO Auto-generated method stub
    }


}
