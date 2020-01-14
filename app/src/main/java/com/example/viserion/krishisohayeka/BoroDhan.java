package com.example.viserion.krishisohayeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoroDhan extends AppCompatActivity implements View.OnClickListener{

    Button br1,br2,br3,br6,br7,br8,br9,br12,br14,br15,br16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boro_dhan);
        br1 = (Button) findViewById(R.id.br1);
        br2 = (Button) findViewById(R.id.br2);
        br3 = (Button) findViewById(R.id.br3);
        br6 = (Button) findViewById(R.id.br6);
        br7 = (Button) findViewById(R.id.br7);
        br8 = (Button) findViewById(R.id.br8);
        br9 = (Button) findViewById(R.id.br9);
        br12 = (Button) findViewById(R.id.br12);
        br14 = (Button) findViewById(R.id.br14);
        br15 = (Button) findViewById(R.id.br15);
        br16 = (Button) findViewById(R.id.br16);

        br1.setOnClickListener(this);
        br2.setOnClickListener(this);
        br3.setOnClickListener(this);
        br6.setOnClickListener(this);
        br7.setOnClickListener(this);
        br8.setOnClickListener(this);
        br9.setOnClickListener(this);
        br12.setOnClickListener(this);
        br14.setOnClickListener(this);
        br15.setOnClickListener(this);
        br16.setOnClickListener(this);


    }
    @Override
    public void onClick(View view){

        if (view.getId()==R.id.br1){
            Intent intent = new Intent(BoroDhan.this, BR1.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br2){
            Intent intent = new Intent(BoroDhan.this, BR2.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br3){
            Intent intent = new Intent(BoroDhan.this, BR3.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br6){
            Intent intent = new Intent(BoroDhan.this, BR6.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br7){
            Intent intent = new Intent(BoroDhan.this, BR7.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br8){
            Intent intent = new Intent(BoroDhan.this, BR8.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br9){
            Intent intent = new Intent(BoroDhan.this, BR9.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.br12){
            Intent intent = new Intent(BoroDhan.this, BR12.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br14){
            Intent intent = new Intent(BoroDhan.this, BR14.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br15){
            Intent intent = new Intent(BoroDhan.this, BR15.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.br16){
            Intent intent = new Intent(BoroDhan.this, BR16.class);
            startActivity(intent);
        }
    }


}
