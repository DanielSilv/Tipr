package com.tipcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class Tipr extends Activity {

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

}
