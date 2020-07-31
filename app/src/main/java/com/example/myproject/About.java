package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    Button Contect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Contect = (Button)findViewById(R.id.btnContect);
        Contect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(About.this,Contect.class);
                startActivity(intent);
                finish();
            }
        });
    }
}