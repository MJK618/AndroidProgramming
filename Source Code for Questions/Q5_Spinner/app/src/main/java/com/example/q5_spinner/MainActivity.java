package com.example.q5_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin=(Spinner)findViewById(R.id.spinner1);
        spin.setOnItemSelectedListener(this);
    }
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id)
    {
        ImageView imagev=(ImageView)findViewById(R.id.imV);
        if(((TextView)view).getText().equals("United Kingdom"))
            imagev.setImageResource(R.drawable.uk);
        if(((TextView)view).getText().equals("France"))
            imagev.setImageResource(R.drawable.france);
        if(((TextView)view).getText().equals("Germany"))
            imagev.setImageResource(R.drawable.germany);
        if(((TextView)view).getText().equals("India"))
            imagev.setImageResource(R.drawable.india);

    }
    public void onNothingSelected(AdapterView<?> parent)
    {
        //another interface callback
    }
}
