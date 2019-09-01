package com.example.mohit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Loginform extends AppCompatActivity {

   EditText et1,et2,et3,et4;
   TextInputLayout textInputName,textInputFullName,textInputEmail,textInputPassword,textInputCPassword;
  RadioButton radioButton1,radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginform);

        getSupportActionBar().setTitle("Register Here");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textInputFullName=findViewById(R.id.text_input_name);
        textInputName=findViewById(R.id.text_input_uName);
        textInputEmail=findViewById(R.id.text_input_lEmail);
        textInputPassword=findViewById(R.id.text_input_lPassword);
        textInputCPassword=findViewById(R.id.text_input_cPassword);
        radioButton1=findViewById(R.id.rd1);
        radioButton2=findViewById(R.id.rd2);
    }






    private boolean validateName()
    {
        String nameInput=textInputFullName.getEditText().getText().toString().trim();
        if(nameInput.isEmpty())
        {
         textInputFullName.setError("Field can't be empty");
         return false;
        } else
        {
            textInputFullName.setError(null);
            return  true;
        }
    }

    private boolean validateUname()
    {
        String usernameInput=textInputName.getEditText().getText().toString().trim();
        if(usernameInput.isEmpty())
        {
            textInputName.setError("Field can't be empty");
            return false;
        } else
        {
            textInputName.setError(null);
            return  true;
        }
    }

    private boolean validateEmail()
    {
        String emailInput=textInputEmail.getEditText().getText().toString().trim();
        if(emailInput.isEmpty())
        {
            textInputEmail.setError("Field can't be empty");
            return false;
        } else
        {
            textInputEmail.setError(null);
            return  true;
        }
    }

    private boolean validatePassword()
    {
        String passwordInput=textInputPassword.getEditText().getText().toString().trim();
        if(passwordInput.isEmpty())
        {
            textInputPassword.setError("Field can't be empty");
            return false;
        } else
        {
            textInputPassword.setError(null);
            return  true;
        }
    }

    private boolean validateCpassword()
    {
        String cpasswordInput=textInputCPassword.getEditText().getText().toString().trim();
        if(cpasswordInput.isEmpty())
        {
            textInputCPassword.setError("Field can't be empty");
            return false;
        } else
        {
            textInputCPassword.setError(null);
            return  true;
        }
    }



    public void register(View view) {

        if(!validateName()|!validateUname()| !validateEmail()| !validatePassword()| !validateCpassword())
        {
            return;
        }
        Toast.makeText(getApplicationContext(),"Done",Toast.LENGTH_SHORT).show();

    }
}
