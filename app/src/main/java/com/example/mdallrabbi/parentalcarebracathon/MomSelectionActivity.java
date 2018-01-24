package com.example.mdallrabbi.parentalcarebracathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MomSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mom_selection);
    }
    public void toBeg_entry(View view){
        Intent intent = new Intent(MomSelectionActivity.this,Beg_DI.class);
        startActivity(intent);
    }
    public void toBec_entry(View view){
        Intent intent = new Intent(MomSelectionActivity.this,Bec_DI.class);
        startActivity(intent);
    }
}
