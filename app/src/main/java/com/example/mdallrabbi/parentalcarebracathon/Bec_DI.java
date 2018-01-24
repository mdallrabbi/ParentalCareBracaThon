package com.example.mdallrabbi.parentalcarebracathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bec_DI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bec__di);
    }
    public void toMainBec(View view){
        Intent intent = new Intent(Bec_DI.this,MainBecActivity.class);
        startActivity(intent);
    }
}
