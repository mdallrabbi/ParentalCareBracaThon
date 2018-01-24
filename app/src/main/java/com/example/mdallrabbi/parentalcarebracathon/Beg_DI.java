package com.example.mdallrabbi.parentalcarebracathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Beg_DI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beg__di);
    }
    public void toMainBeg(View view){
        Intent intent = new Intent(Beg_DI.this,MainBegActivity.class);
        startActivity(intent);
    }
}
