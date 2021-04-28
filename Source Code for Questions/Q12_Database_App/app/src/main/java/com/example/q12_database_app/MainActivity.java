package com.example.q12_database_app;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    dbhelper myDb;
    EditText editName,editSurname,editMarks ,editTextId;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete;

    Button btnviewUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new dbhelper(this);

        editName = findViewById(R.id.editText_name);
        editSurname = findViewById(R.id.editText_surname);
        editMarks = findViewById(R.id.editText_Marks);
        editTextId = findViewById(R.id.editText_id);
        btnAddData = findViewById(R.id.button_add);
        btnviewAll = findViewById(R.id.button_viewAll);
        btnviewUpdate= findViewById(R.id.button_update);
        btnDelete= findViewById(R.id.button_delete);
        AddData();
        viewAll();
        UpdateData();
        DeleteData();
    }
    public void DeleteData() {
        btnDelete.setOnClickListener(
                v -> {
                    Integer deletedRows = myDb.deleteData(editTextId.getText().toString());
                    if(deletedRows > 0)
                        Toast.makeText(MainActivity.this,"Data Deleted",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this,"Data not Deleted",Toast.LENGTH_LONG).show();
                }
        );
    }
    public void UpdateData() {
        btnviewUpdate.setOnClickListener(
                v -> {
                    boolean isUpdate = myDb.updateData(editTextId.getText().toString(),
                            editName.getText().toString(),
                            editSurname.getText().toString(),editMarks.getText().toString());
                    if(isUpdate)
                        Toast.makeText(MainActivity.this,"Data Update",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this,"Data not Updated",Toast.LENGTH_LONG).show();
                }
        );
    }
    public  void AddData() {
        btnAddData.setOnClickListener(
                v -> {
                    boolean isInserted = myDb.insertData(editName.getText().toString(),
                            editSurname.getText().toString(),
                            editMarks.getText().toString() );
                    if(isInserted)
                        Toast.makeText(MainActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(MainActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                }
        );
    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                v -> {
                    Cursor res = myDb.getAllData();
                    if(res.getCount() == 0) {
                        // show message
                        showMessage("Error","Nothing found");
                        return;
                    }

                    StringBuilder buffer = new StringBuilder();
                    while (res.moveToNext()) {
                        buffer.append("Id :").append(res.getString(0)).append("\n");
                        buffer.append("Name :").append(res.getString(1)).append("\n");
                        buffer.append("Surname :").append(res.getString(2)).append("\n");
                        buffer.append("Marks :").append(res.getString(3)).append("\n\n");
                    }

                    // Show all data
                    showMessage("Data",buffer.toString());
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
    public void clear(View v) {
        editName.setText("");
        editSurname.setText("");
        editMarks.setText("");
        editTextId.setText("");
    }
}
