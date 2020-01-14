package com.example.viserion.krishisohayeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AmonDhan extends AppCompatActivity implements View.OnClickListener {

    Button br4,br5,br10,br11,br22,br23,br25,br39,bri52;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amon_dhan);
        br4 = (Button) findViewById(R.id.br4);
        br5 = (Button) findViewById(R.id.br5);
        br10 = (Button) findViewById(R.id.br10);
        br11 = (Button) findViewById(R.id.br11);
        br22 = (Button) findViewById(R.id.br22);
        br23 = (Button) findViewById(R.id.br23);
        br25 = (Button) findViewById(R.id.br25);
        br39 = (Button) findViewById(R.id.br39);
        bri52 = (Button) findViewById(R.id.bri52);

        br4.setOnClickListener(this);
        br5.setOnClickListener(this);
        br10.setOnClickListener(this);
        br11.setOnClickListener(this);
        br22.setOnClickListener(this);
        br23.setOnClickListener(this);
        br25.setOnClickListener(this);
        br39.setOnClickListener(this);
        bri52.setOnClickListener(this);


    }
    @Override
    public void onClick(View view){

        if (view.getId()==R.id.br4){
            Intent intent = new Intent(AmonDhan.this, BR4.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br5){
            Intent intent = new Intent(AmonDhan.this, BR5.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br10){
            Intent intent = new Intent(AmonDhan.this, BR10.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br11){
            Intent intent = new Intent(AmonDhan.this, BR11.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br22){
            Intent intent = new Intent(AmonDhan.this, BR22.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br23){
            Intent intent = new Intent(AmonDhan.this, BR23.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.br25){
            Intent intent = new Intent(AmonDhan.this, BR25.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.br39){
            Intent intent = new Intent(AmonDhan.this, BR39.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.bri52){
            Intent intent = new Intent(AmonDhan.this, BRI52.class);
            startActivity(intent);
        }
    }
}
