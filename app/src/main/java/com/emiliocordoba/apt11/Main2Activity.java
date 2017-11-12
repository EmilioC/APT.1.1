package com.emiliocordoba.apt11;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class Main2Activity extends AppCompatActivity {

    Button btn2activity;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10,
            checkBox11, checkBox12, checkBox13, checkBox14, checkBox15, checkBox16, checkBox17, checkBox18, checkBox19,
            checkBox20, checkBox21, checkBox22, checkBox23, checkBox24, checkBox25, checkBox26, checkBox27 ,checkBox28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2activity = (Button)findViewById(R.id.btn2activity);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
        checkBox13 = (CheckBox) findViewById(R.id.checkBox13);
        checkBox14 = (CheckBox) findViewById(R.id.checkBox14);
        checkBox15 = (CheckBox) findViewById(R.id.checkBox15);
        checkBox16 = (CheckBox) findViewById(R.id.checkBox16);
        checkBox17 = (CheckBox) findViewById(R.id.checkBox17);
        checkBox18 = (CheckBox) findViewById(R.id.checkBox18);
        checkBox19 = (CheckBox) findViewById(R.id.checkBox19);
        checkBox20 = (CheckBox) findViewById(R.id.checkBox20);
        checkBox21 = (CheckBox) findViewById(R.id.checkBox21);
        checkBox22 = (CheckBox) findViewById(R.id.checkBox22);
        checkBox23 = (CheckBox) findViewById(R.id.checkBox23);
        checkBox24 = (CheckBox) findViewById(R.id.checkBox24);
        checkBox25 = (CheckBox) findViewById(R.id.checkBox25);
        checkBox26 = (CheckBox) findViewById(R.id.checkBox26);
        checkBox27 = (CheckBox) findViewById(R.id.checkBox27);
        checkBox28 = (CheckBox) findViewById(R.id.checkBox28);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.tool_baractivity2);
    }

    }

