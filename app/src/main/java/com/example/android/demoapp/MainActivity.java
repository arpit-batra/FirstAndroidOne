package com.example.android.demoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        EditText userName = findViewById(R.id.userName);
        EditText pas = findViewById(R.id.pas);
        Log.i("info","Your username is "+userName.getText().toString()+" and your password is "+pas.getText().toString() );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
