package com.example.myproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
        String u="alpha03@gmail.com";
        String p="12345";
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuSplash:
                Intent intentAbout = new Intent(Login.this,MainActivity.class);
                startActivity(intentAbout);
                Toast.makeText(this, "Splash Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuLogin:
                Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuAbout:
                Intent intentContact = new Intent(Login.this,About.class);
                startActivity(intentContact);
                Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuContact:
                Intent intentLogin = new Intent(Login.this, Contact.class);
                startActivity(intentLogin);
                Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}