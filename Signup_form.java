package com.example.mohit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Signup_form extends AppCompatActivity {

   TextInputLayout textInputEmail,textInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_form);
        getSupportActionBar().setTitle("Sign Up");


        textInputEmail=findViewById(R.id.text_input_email);
        textInputPassword=findViewById(R.id.text_input_password);

    }

    public void btn_signupForm(View view) {

        Intent intent=new Intent(getApplicationContext(),Loginform.class);
        startActivity(intent);
    }


    private boolean validateEmail()
    {
        String emailInput=textInputEmail.getEditText().getText().toString().trim();
        if(emailInput.isEmpty())
        {
            textInputEmail.setError("Field can't be empty");
            return false;
        } else {
         textInputEmail.setError(null);
            return true;
        }
    }

    private boolean validatePassword()
    {
        String passwordInput=textInputPassword.getEditText().getText().toString().trim();
        if(passwordInput.isEmpty())
        {
            textInputPassword.setError("Field can't be empty");
            return false;
        } else {
            textInputPassword.setError(null);
            return true;
        }
    }


    public void confirmInput(View view) {

        if(!validateEmail() | !validatePassword())
        {
            return;
        }

        Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();
    }
}
