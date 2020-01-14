package com.example.viserion.krishisohayeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AushDhan extends AppCompatActivity implements View.OnClickListener{

    Button br1,br2,br6,br7,br8,br9,br12,br15,br20,br21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aush_dhan);

        br1 = (Button) findViewById(R.id.br1);
        br2 = (Button) findViewById(R.id.br2);
        br6 = (Button) findViewById(R.id.br6);
        br7 = (Button) findViewById(R.id.br7);
        br8 = (Button) findViewById(R.id.br8);
        br9 = (Button) findViewById(R.id.br9);
        br12 = (Button) findViewById(R.id.br12);
        br15 = (Button) findViewById(R.id.br15);
        br20 = (Button) findViewById(R.id.br20);
        br21 = (Button) findViewById(R.id.br21);

        br1.setOnClickListener(this);
        br2.setOnClickListener(this);
        br6.setOnClickListener(this);
        br7.setOnClickListener(this);
        br8.setOnClickListener(this);
        br9.setOnClickListener(this);
        br12.setOnClickListener(this);
        br15.setOnClickListener(this);
        br20.setOnClickListener(this);
        br21.setOnClickListener(this);


    }
    @Override
    public void onClick(View view){

        if (view.getId()==R.id.br1){
            Intent intent = new Intent(AushDhan.this, BR1.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br2){
            Intent intent = new Intent(AushDhan.this, BR2.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br6){
            Intent intent = new Intent(AushDhan.this, BR6.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br7){
            Intent intent = new Intent(AushDhan.this, BR7.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br8){
            Intent intent = new Intent(AushDhan.this, BR8.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br9){
            Intent intent = new Intent(AushDhan.this, BR9.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.br12){
            Intent intent = new Intent(AushDhan.this, BR12.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.br15){
            Intent intent = new Intent(AushDhan.this, BR15.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.br20){
            Intent intent = new Intent(AushDhan.this, BR20.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br21){
            Intent intent = new Intent(AushDhan.this, BR21.class);
            startActivity(intent);
        }
    }
}
