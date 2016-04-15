package com.raydeveloper.foodeliverray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogInLog = (Button) findViewById(R.id.login_button_login);
        Button btnForget = (Button) findViewById(R.id.forget_button);

    }
}
