package com.example.testpf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText busNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        busNum = findViewById(R.id.BusesQ);
    }

    public void saveButton(View view){
        String buses = busNum.getText().toString();
        int busNUMF = Integer.parseInt(buses);

        Toast.makeText(this, "Answer has been saved " +busNUMF, Toast.LENGTH_SHORT).show();
    }
}
