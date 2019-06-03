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
    EditText iterNum;
    private Button btnMove;
    public static final String EXTRA_TEXT1 = "com.example.application.example.EXTRA_TEXT1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        busNum = findViewById(R.id.BusesQ);
        volNum = findViewById(R.id.Voltage);
        iterNum = findViewById(R.id.Iterations);

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

    public void saveButton2(View view){
        String voltages = volNum.getText().toString();
        int volNUMF = Integer.parseInt(voltages);

        Toast.makeText(this, "Answer has been saved " +volNUMF, Toast.LENGTH_SHORT).show();
    }

    public void saveButton3(View view){
        String iterations = volNum.getText().toString();
        int iterNUMF = Integer.parseInt(iterations);

        Toast.makeText(this, "Answer has been saved " +iterNUMF, Toast.LENGTH_SHORT).show();
    }

    private void moveButton(){
        EditText editText1 = (EditText) findViewById(R.id.BusesQ);
        String text1 = editText1.getText().toString();

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra(EXTRA_TEXT1, text1);
        startActivity(intent);
    }
}
