package com.example.zhengyixing.myfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ChooseDifficulty extends AppCompatActivity {

    private Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_difficulty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        onClickButtonListener();
    }

    public void onClickButtonListener(){
        button1 = (Button) findViewById(R.id.easyButton);
        button2 = (Button) findViewById(R.id.middleButton);
        button3 = (Button) findViewById(R.id.hardButton);
        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Source.setSpeed(10);
                        Source.setEclapseTime(2000);
                        Intent intent = new Intent("com.example.zhengyixing.myfinal.Game");
                        startActivity(intent);
                    }
                }
        );

        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Source.setSpeed(25);
                        Source.setEclapseTime(1000);
                        Intent intent = new Intent("com.example.zhengyixing.myfinal.Game");
                        startActivity(intent);
                    }
                }
        );

        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        Source.setSpeed(40);
                        Source.setEclapseTime(600);
                        Intent intent = new Intent("com.example.zhengyixing.myfinal.Game");
                        startActivity(intent);
                    }
                }
        );

    }

}
