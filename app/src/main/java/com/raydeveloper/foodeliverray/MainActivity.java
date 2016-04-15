package com.raydeveloper.foodeliverray;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogIn = (Button) findViewById(R.id.login_button);
        Button btnSignUp = (Button) findViewById(R.id.signup_button);
        EditText username = (EditText) findViewById(R.id.username_edittext);
        EditText emailAddress = (EditText) findViewById(R.id.emailAddress_edittext);
    }
}
