package com.example.fall2020team04sec01_easemynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;
    TextView register;
    TextView notregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username= (EditText)findViewById(R.id.et_username);
        password= (EditText)findViewById(R.id.et_password);
        login= (Button) findViewById(R.id.btn_login);
        register= (TextView)findViewById(R.id.tv_register);
        notregister= (TextView)findViewById(R.id.tv_notregister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(registerIntent);


            }
        }

        );

    }
}
