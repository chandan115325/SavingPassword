package com.example.y.preferencesexcercise;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SetfrequencyActivity extends AppCompatActivity {
    //Data variables to handle the Views
    EditText et_frequencyinput;
    Button bt_saveinfofrequency;
    Button bt_displayinfofrequency;
    TextView tv_infofrequency;

    /**
     * Assigning all views to the referene view to display and fetch text and to perform action on buttons
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setfrequency);
        et_frequencyinput = (EditText) findViewById(R.id.et_frequencyinput);
        bt_saveinfofrequency = (Button) findViewById(R.id.button_savefrequency);
        bt_displayinfofrequency = (Button) findViewById(R.id.button_displayfrquency);
        tv_infofrequency = (TextView) findViewById(R.id.tv_infofrquency);

        bt_saveinfofrequency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveDataFrequency();
            }
        });
        bt_displayinfofrequency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayDataFrequency();
            }
        });
    }
//To display frequency
    private void displayDataFrequency() {
        SharedPreferences preferences = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        String password = preferences.getString("frequency","");
        tv_infofrequency.setText(password);
        tv_infofrequency.setVisibility(View.VISIBLE);
    }
//Saving the frequency
    private void saveDataFrequency() {
        SharedPreferences preferences = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("frequency",et_frequencyinput.getText().toString());
        editor.apply();
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }
}