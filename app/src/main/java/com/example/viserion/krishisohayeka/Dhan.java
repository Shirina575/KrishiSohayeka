package com.example.viserion.krishisohayeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dhan extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhan);

        button1 = (Button) findViewById(R.id.Button1);
        button2 = (Button) findViewById(R.id.Button2);
        button3 = (Button) findViewById(R.id.Button3);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


    }

    @Override
    public void onClick(View view){

        if (view.getId()==R.id.Button1){
            Intent intent = new Intent(Dhan.this, AushDhan.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button2){
            Intent intent = new Intent(Dhan.this, AmonDhan.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button3){
            Intent intent = new Intent(Dhan.this, BoroDhan.class);
            startActivity(intent);
        }
    }
}
