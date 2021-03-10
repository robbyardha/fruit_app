package com.robby.fruitproject;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.hdodenhof.circleimageview.CircleImageView;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //HidingActionBar
        ActionBar myactiobar = getSupportActionBar();
        myactiobar.hide();

        //ClickListener
        Button backmenu = findViewById(R.id.btn_back);
        backmenu.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent moveintent = new Intent(AboutActivity.this, MainActivity.class);
        startActivity(moveintent);

    }
}
