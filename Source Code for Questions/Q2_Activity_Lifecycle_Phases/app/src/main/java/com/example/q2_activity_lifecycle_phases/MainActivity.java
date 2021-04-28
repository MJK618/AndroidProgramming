package com.example.q2_activity_lifecycle_phases;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String str="LifecycleStates";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(str,"OnCreate State");
    }
    protected void onStart(){
        super.onStart();
        Log.d(str,"OnStart State");
    }
    protected void onRestart(){
        super.onRestart();
        Log.d(str,"OnRestart State");
    }
    protected void onResume(){
        super.onResume();
        Log.d(str,"OnResume State");
    }
    protected void onPause(){
        super.onPause();
        Log.d(str,"OnPause State");
    }
    protected void onStop(){
        super.onStop();
        Log.d(str,"OnStop State");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.d(str,"OnDestroy State");
    }
}
