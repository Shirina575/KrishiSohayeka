package com.example.viserion.krishisohayeka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sobji extends AppCompatActivity implements View.OnClickListener{

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13,button14,button15,button16,button17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobji);

        button1 = (Button) findViewById(R.id.Button1);
        button2 = (Button) findViewById(R.id.Button2);
        button3 = (Button) findViewById(R.id.Button3);
        button4 = (Button) findViewById(R.id.Button4);
        button5 = (Button) findViewById(R.id.Button5);
        button6 = (Button) findViewById(R.id.Button6);
        button7 = (Button) findViewById(R.id.Button7);
        button8 = (Button) findViewById(R.id.Button8);
        button9 = (Button) findViewById(R.id.Button9);
        button10 = (Button) findViewById(R.id.Button10);
        button11 = (Button) findViewById(R.id.Button11);
        button12 = (Button) findViewById(R.id.Button12);
        button13 = (Button) findViewById(R.id.Button13);
        button14 = (Button) findViewById(R.id.Button14);
        button15 = (Button) findViewById(R.id.Button15);
        button16 = (Button) findViewById(R.id.Button16);
        button17 = (Button) findViewById(R.id.Button17);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);



    }

    @Override
    public void onClick(View view){

       if (view.getId()==R.id.Button1){

           Intent intent = new Intent(Sobji.this, Dherosh.class);
           startActivity(intent);
       }

        if (view.getId()==R.id.Button2){

            Intent intent = new Intent(Sobji.this, LalShak.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button3){

            Intent intent = new Intent(Sobji.this, PalongShak.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button4){

            Intent intent = new Intent(Sobji.this, Jhinga.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button5){

            Intent intent = new Intent(Sobji.this, Borboti.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button6){

            Intent intent = new Intent(Sobji.this, Begun.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button7){

            Intent intent = new Intent(Sobji.this, Lau.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button8){

            Intent intent = new Intent(Sobji.this, Korolla.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button9){

            Intent intent = new Intent(Sobji.this, Sosha.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button10){

            Intent intent = new Intent(Sobji.this, Gajor.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button11){

            Intent intent = new Intent(Sobji.this, MistiKumra.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.Button12){

            Intent intent = new Intent(Sobji.this, Potol.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.Button13){

            Intent intent = new Intent(Sobji.this, Mula.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button14){

            Intent intent = new Intent(Sobji.this, Tometo.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button15){

            Intent intent = new Intent(Sobji.this, GolAlu.class);
            startActivity(intent);
        }

        if (view.getId()==R.id.Button16){

            Intent intent = new Intent(Sobji.this, Sim.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.Button17){

            Intent intent = new Intent(Sobji.this, KachaMorich.class);
            startActivity(intent);
        }



    }
}
