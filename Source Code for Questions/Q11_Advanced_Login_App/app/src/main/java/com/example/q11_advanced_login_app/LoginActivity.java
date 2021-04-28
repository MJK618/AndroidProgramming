package com.example.q11_advanced_login_app;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    TextView textView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView=findViewById(R.id.textView2);
        Intent f=getIntent();
        String d=f.getStringExtra("username");
        textView.setText("Hello "+d);
        Toast.makeText(this,"Login Successful",Toast.LENGTH_LONG).show();
    }
    public void onCL(View v)
    {

        AlertDialog.Builder dbox=new AlertDialog.Builder(this);
        dbox.setTitle("Confirm Dialog Box");
        dbox.setMessage("Do you want to log out?");

        dbox.setPositiveButton("YES", (dialog, which) -> {

            Intent i=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });

        dbox.setNegativeButton("NO", (dialog, which) -> Toast.makeText(getApplicationContext(), "Application not exited" ,
                Toast.LENGTH_SHORT).show());
        dbox.show();
    }
}

