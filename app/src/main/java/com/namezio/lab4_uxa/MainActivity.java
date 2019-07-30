package com.namezio.lab4_uxa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnB1;
    private Button btnB2;
    private Button btnB3;
    private Button btnB4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnB1 = findViewById(R.id.btn_b1);
        btnB2 = findViewById(R.id.btn_b2);
        btnB3 = findViewById(R.id.btn_b3);
        btnB4 = findViewById(R.id.btn_b4);

        btnB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,B1Activity.class);
                startActivity(intent);
            }
        });
        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,B2Activity.class);
                startActivity(intent);
            }
        });
        btnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,B3Activity.class);
                startActivity(intent);
            }
        });
        btnB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,B4Activity.class);
                startActivity(intent);
            }
        });
    }
}
