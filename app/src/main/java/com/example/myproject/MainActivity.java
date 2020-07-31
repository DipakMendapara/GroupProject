package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


        private static int SPLASH_SCREEN_OUT = 2000;
        @Override
        protected void onCreate(Bundle saveInstanceState) {
            super.onCreate(saveInstanceState);
            setContentView(R.layout.activity_main);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, Login.class);
                    startActivity(intent);
                    finish();
                }
            },SPLASH_SCREEN_OUT);

        }
}