package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void Login(View view)
    {
        EditText Edittxtuser=findViewById(R.id.edtUsername);
        EditText Edittxtpass=findViewById(R.id.edtPassword);
        String Username=Edittxtuser.getText().toString();
        String Password=Edittxtpass.getText().toString();
        String u="alpha@gmail.com";
        String p="1234";
        String blank="";
        if(Username.equals(blank) ||  Password.equals(blank))
        {
            if(Username.equals(blank) && Password.equals(blank))
            {
                Toast.makeText(this, "Please Enter Username and Password...", Toast.LENGTH_SHORT).show();
                return;
            }
            if(Username.equals(blank))
            {
                Toast.makeText(this, "Please Enter Username...", Toast.LENGTH_SHORT).show();
            }
            if(Password.equals(blank))
            {
                Toast.makeText(this, "Please Enter Password...", Toast.LENGTH_SHORT).show();
            }
        }
        else if(Username.equals(u) && Password.equals(p))
        {
            Intent intent=new Intent(this,About.class);

            startActivity(intent);
            Edittxtuser.setText("");
            Edittxtpass.setText("");
        }
        else
        {
            Toast.makeText(this, "Please Enter Valid Username and Password...", Toast.LENGTH_SHORT).show();
        }


    }


}