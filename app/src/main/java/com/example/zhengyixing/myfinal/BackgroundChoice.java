package com.example.zhengyixing.myfinal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.graphics.BitmapFactory;

public class BackgroundChoice extends AppCompatActivity {

    private Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_choice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        onClickButtonListener();


    }



    public void onClickButtonListener(){
        button1 = (Button) findViewById(R.id.back1);
        button2 = (Button) findViewById(R.id.back2);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Source.setBackground(BitmapFactory.decodeResource(getResources(), R.drawable.background1));
                        Intent intent = new Intent("com.example.zhengyixing.myfinal.ChooseDifficulty");
                        startActivity(intent);
                    }
                }
        );

        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Source.setBackground(BitmapFactory.decodeResource(getResources(), R.drawable.background2));
                        Intent intent = new Intent("com.example.zhengyixing.myfinal.ChooseDifficulty");
                        startActivity(intent);
                    }
                }
        );
    }

}
