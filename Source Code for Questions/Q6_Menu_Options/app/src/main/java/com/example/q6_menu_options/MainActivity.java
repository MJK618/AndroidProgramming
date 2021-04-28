package com.example.q6_menu_options;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.themenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "1. Android", Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "2. BitBucket", Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "3. Code", Toast.LENGTH_LONG).show();
                break;
            case R.id.item4:
                Toast.makeText(this, "4. Dart", Toast.LENGTH_LONG).show();
                break;
            case R.id.item5:
                Toast.makeText(this, "5. Enterprise", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
