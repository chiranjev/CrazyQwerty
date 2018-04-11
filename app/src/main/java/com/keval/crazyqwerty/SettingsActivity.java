package com.keval.crazyqwerty;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import es.dmoral.toasty.Toasty;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

//        Spinner levelSpinner;
//        ArrayAdapter<String> levelAdapter = null;
//        ArrayList<String> array = new ArrayList<String>();
//        array.add("None");
//        array.add("Easy");
//        array.add("Medium");
//        array.add("Hard");
//        array.add("Insane");
//        levelSpinner= (Spinner) findViewById(R.id.spinner_level);
//        levelSpinner.setAdapter(levelAdapter);
//        levelAdapter= new ArrayAdapter<String>(this, R.layout.spinner_item, array);
    }



    @Override
    public void onBackPressed() {
        //Display alert message when back button has been pressed

        Intent z = new Intent(getApplicationContext(), NewGameActivity.class);
        startActivity(z);

        return;
    }

}
