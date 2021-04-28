package com.example.q3_explicit_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendtext(View v) {
        EditText edit =(EditText)findViewById(R.id.editText);
        String str = edit.getText().toString();
        Intent i = new Intent(this,SecondaryActivity.class);

        i.putExtra("abc",str);
        startActivity(i);

    }
}