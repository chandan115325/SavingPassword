package com.example.y.preferencesexcercise;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv_setpassword;
    TextView tv_lockthescreen;
    TextView tv_setfrequency;
    CheckBox cb_chechkbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setLogo(R.drawable.ic);
        actionbar.setDisplayUseLogoEnabled(true);
        actionbar.setDisplayShowHomeEnabled(true);
        tv_lockthescreen = (TextView) findViewById(R.id.tv_lockthescreen);
        tv_setpassword = (TextView) findViewById(R.id.tv_setpassword);
        tv_setfrequency = (TextView) findViewById(R.id.tv_setfrequency);
        cb_chechkbox = (CheckBox) findViewById(R.id.cb_checkBox);
        addListnerToCB();
        addListnerToScreenlock();
        addListnerToPassword();
        addListnerToFrequency();


    }

    public void addListnerToCB() {
        cb_chechkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cb_chechkbox.isChecked()) {
                    Toast.makeText(MainActivity.this, "Password wil be set for Screenlock option is checked", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
    public void addListnerToScreenlock(){
        tv_lockthescreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb_chechkbox.isChecked()) {
                    Toast.makeText(MainActivity.this, "Password set for Screenlock", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
    public void addListnerToPassword(){
        tv_setpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SetpasswordActivity.class);
                startActivity(i);
            }
        });
    }
    public void addListnerToFrequency(){
        tv_setfrequency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SetfrequencyActivity.class);
                startActivity(i);
            }
        });

    }
}
