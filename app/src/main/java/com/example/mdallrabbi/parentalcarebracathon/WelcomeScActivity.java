package com.example.mdallrabbi.parentalcarebracathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeScActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_sc);
    }
    
    public void toSignup(View view){
        Intent intent = new Intent(WelcomeScActivity.this,SignUpActivity.class);
        startActivity(intent);
    }
}
