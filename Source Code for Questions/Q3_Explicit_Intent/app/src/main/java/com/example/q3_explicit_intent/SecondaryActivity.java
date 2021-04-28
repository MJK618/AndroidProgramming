package com.example.q3_explicit_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        TextView text =(TextView)findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("abc");
        text.setText(str);

    }
}
