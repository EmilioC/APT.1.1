package com.emiliocordoba.apt11;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.emiliocordoba.apt11.R;

public class Activity_navapt extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navapt);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.tool_barapt);

      /* final TextView  LinkAPT = (TextView)findViewById(R.id.tvLinkAPT);
        LinkAPT.setMovementMethod (LinkMovementMethod.getInstance()); */


    }
}
