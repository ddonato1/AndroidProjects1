package com.example.testpf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText busNum;
    EditText volNum;
    EditText jacNum;
    private Button btnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        busNum = findViewById(R.id.BusesQ);
        volNum = findViewById(R.id.Voltage);

        btnMove = findViewById(R.id.buttonPart2);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveButton();
            }
        });

    }

    public void saveButton(View view){
        String buses = busNum.getText().toString();
        int busNUMF = Integer.parseInt(buses);

        Toast.makeText(this, "Answer has been saved " +busNUMF, Toast.LENGTH_SHORT).show();
    }

    private void moveButton(){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
