package com.suhail_malik.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button setting;
    Button singleplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singleplayer=findViewById(R.id.button);

    }

    public void singleplayer(View view){

        Intent intent=new Intent(getApplicationContext(),maingame.class);
        startActivity(intent);

    }
}