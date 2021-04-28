package com.example.q11_advanced_login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View v) {
        String txt = "Welcome ";
        EditText ed1 = (EditText) findViewById(R.id.e1);
        EditText ed2 = (EditText) findViewById(R.id.e2);

        String a=ed1.getText().toString();
        String b=ed2.getText().toString();
        if(a.equals("Jatin") && b.equals("8647")) {
            Intent intent=new Intent(this, LoginActivity.class);
            intent.putExtra("username",a);
            startActivity(intent);

        } else {
            Toast.makeText(this,"Invalid User", Toast.LENGTH_LONG).show();
        }
    }

}
