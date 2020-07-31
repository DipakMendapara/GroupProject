package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
        EditText Username;
        EditText Password;
        Button Login;

        private static int SPLASH_SCREEN_OUT = 2000;
        @Override
        protected void onCreate(Bundle saveInstanceState) {
            super.onCreate(saveInstanceState);
            setContentView(R.layout.activity_main);

            Username = (EditText) findViewById(R.id.edtUsername);
            Password = (EditText) findViewById(R.id.edtPassword);
            Login = (Button) findViewById(R.id.btnLogin);
            Login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Login.this,About.class);
                    startActivity(intent);
                }
            });
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, Login.class);
                    startActivity(intent);
                }
            },SPLASH_SCREEN_OUT);
        }
}