package com.example.android.demoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int b=0;
    public void clickFunction(View view)
    {
        ImageView iv;
        iv = (ImageView)findViewById(R.id.imgView);
        if(b==0)
            b=1;
        else
            b=0;
        if(b==0)
            iv.setImageResource(R.drawable.campus);
        else
            iv.setImageResource(R.drawable.care);

        //
        EditText userName = findViewById(R.id.userName);
        EditText pas = findViewById(R.id.pas);
        Toast.makeText(this, "Your username is "+userName.getText().toString()+" and your password is "+pas.getText().toString(), Toast.LENGTH_LONG).show();
        Log.i("info","Your username is "+userName.getText().toString()+" and your password is "+pas.getText().toString() );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
