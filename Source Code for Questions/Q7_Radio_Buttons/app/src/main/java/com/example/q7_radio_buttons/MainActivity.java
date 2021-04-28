package com.example.q7_radio_buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rgrp;
    private RadioButton r1,r2,r3,r4,r5;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgrp = (RadioGroup)findViewById(R.id.rg1);
        r1=(RadioButton)findViewById(R.id.rb1);
        r2=(RadioButton)findViewById(R.id.rb2);
        r3=(RadioButton)findViewById(R.id.rb3);
        r4=(RadioButton)findViewById(R.id.rb4);
        r5=(RadioButton)findViewById(R.id.rb5);
        t1= (TextView)findViewById(R.id.t1);

        rgrp.setOnCheckedChangeListener(
                (RadioGroup.OnCheckedChangeListener)
                (group, checkedId) -> {

            RadioButton nameRadio = (RadioButton)
                    findViewById(checkedId);


            String s1=nameRadio.getText().toString();
            Toast.makeText(MainActivity.this,s1, Toast.LENGTH_SHORT).show();

            if(checkedId==r1.getId())
            {
                String s2="Teacher - Dr.Suruchi";
                t1.setText(s2);
            }
            else if(checkedId==r2.getId()) {
                String s3="Teacher - Dr. Surbhi";
                t1.setText(s3);
            }
            else{
                String s4="Teacher - Dr. Meenakshi";
                t1.setText(s4);
            }

        });

    }
}
