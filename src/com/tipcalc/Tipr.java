package com.tipcalc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
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
        final SeekBar tipPercentSB = (SeekBar) findViewById(R.id.tipPercent);
        tipPercentSB.setOnSeekBarChangeListener(this);
        
        // Creates a button to send the seek bar to the tenth interval
        final Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				tipPercentSB.setProgress(10);
			}
		});
        final Button button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				tipPercentSB.setProgress(20);
			}
		});
        final Button button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				tipPercentSB.setProgress(30);
			}
		});
        final Button button40 = (Button) findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				tipPercentSB.setProgress(40);
			}
		});
        final Button button50 = (Button) findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				tipPercentSB.setProgress(50);
			}
		});
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
