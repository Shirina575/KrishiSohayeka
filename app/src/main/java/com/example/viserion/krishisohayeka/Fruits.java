package com.example.viserion.krishisohayeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fruits extends AppCompatActivity implements View.OnClickListener{
    Button mango, orange, lichi,pineapple, papaya, kul, peyara, banana, sofeda;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        mango = (Button) findViewById(R.id.Button1);
        orange = (Button) findViewById(R.id.Button2);
        lichi = (Button) findViewById(R.id.Button3);
        pineapple = (Button) findViewById(R.id.Button4);
        papaya = (Button) findViewById(R.id.Button5);
        kul = (Button) findViewById(R.id.Button6);
        peyara = (Button) findViewById(R.id.Button7);
        banana = (Button) findViewById(R.id.Button8);
        sofeda = (Button) findViewById(R.id.Button9);

        mango.setOnClickListener(this);
        orange.setOnClickListener(this);
        lichi.setOnClickListener(this);
        pineapple.setOnClickListener(this);
        papaya.setOnClickListener(this);
        kul.setOnClickListener(this);
        peyara.setOnClickListener(this);
        banana.setOnClickListener(this);
        sofeda.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){

        if (view.getId()==R.id.Button1){
            Intent intent = new Intent(Fruits.this, Mango.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button2){
            Intent intent = new Intent(Fruits.this, Orange.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button3){
            Intent intent = new Intent(Fruits.this, Lichi.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button4){
            Intent intent = new Intent(Fruits.this, Pineapple.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button5){
            Intent intent = new Intent(Fruits.this, Papaya.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button6){
            Intent intent = new Intent(Fruits.this, Kul.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button7){
            Intent intent = new Intent(Fruits.this, Peyara.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button8){
            Intent intent = new Intent(Fruits.this, Banana.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button9){
            Intent intent = new Intent(Fruits.this, Sofeda.class);
            startActivity(intent);
        }

   }
}
