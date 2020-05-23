package com.lohdapps.foodgalore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_activity extends AppCompatActivity implements View.OnClickListener{

    private Button login_button;
    private TextView register_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(this);

        register_textview = findViewById(R.id.Register);

    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.login_button){
            Intent loginintent = new Intent(Login_activity.this, Register_activity.class);
            startActivity(loginintent);

        }

    }
}
