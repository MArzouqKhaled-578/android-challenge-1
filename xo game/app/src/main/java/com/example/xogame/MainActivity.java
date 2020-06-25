package com.example.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Boolean Xturn = true;
    TextView  turn;
     int[] Xarray = new int[9];
    int[] Oarray = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);




    final Button zero =findViewById(R.id.button1);
    final Button one  =findViewById(R.id.button2);
    final Button two  =findViewById(R.id.button3);
    final Button three=findViewById(R.id.button4);
    final Button four =findViewById(R.id.button5);
    final Button five =findViewById(R.id.button6);
    final Button sex  =findViewById(R.id.button7);
    final Button saven=findViewById(R.id.button8);
    final Button eight=findViewById(R.id.button9);
    turn=findViewById(R.id.textView3);
    ImageButton reset=findViewById(R.id.resetButton);

    reset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            zero.setText("");
            one.setText("");
            two.setText("");
            three.setText("");
            four.setText("");
            five.setText("");
            sex.setText("");
            saven.setText("");
            eight.setText("");
            for (int i = 0 ;i<Xarray.length;i++){
                Xarray[i]=0;
            }
            for (int i =0; i <Oarray.length;i++){
                Xarray[i]=0;
            }
        }});

    zero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(Xturn){

                checkXwin();
                Xarray[0]=1;
                zero.setText("X");
            }

            else{
                checkOwin();
                Xarray[0]=1;
                zero.setText("O");}

        }
    });









    one.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           if(Xturn){
               checkXwin();
               Xarray[1]=1;
               one.setText("X");
           }


           else{
               checkOwin();
               Xarray[1]=1;

               one.setText("O");

           }
        }
    });


   two.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(Xturn) {
                checkXwin();
                Xarray[2]=1;

                two.setText("X");


            }


            else{
                checkOwin();
                Xarray[2]=1;

                two.setText("O");
            }
        }
    });

    three.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(Xturn){
                checkXwin();
                three.setText("X");
                Xarray[3]=1;


            }


            else {
                three.setText("O");
                checkOwin();
                Xarray[3]=1;}
        }
    });


    four.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(Xturn){
                Xarray[4]=1;
                checkXwin();
                four.setText("X");

            }

            else{
                checkOwin();
                Xarray[4]=1;

                four.setText("O");
            }
        }
    });

    five.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(Xturn){
                checkXwin();
                five.setText("X");
                Xarray[5]=1;

            }

            else{
                Xarray[5]=1;
                checkOwin();
                five.setText("O");
            }
        }
    });

    sex.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(Xturn){
                checkXwin();
                sex.setText("X");
                Xarray[6]=1;

            }

            else{
                Xarray[6]=1;
                checkOwin();
                sex.setText("O");
            }
        }
    });


    saven.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(Xturn){
                Xarray[7]=1;
                checkXwin();
                saven.setText("X");

            }

            else{
                Xarray[7]=1;
                checkOwin();
                saven.setText("O");
            }
        }
    });
    eight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(Xturn){
                checkXwin();
                Xarray[8]=1;
                eight.setText("X");

            }

            else {
                Xarray[8]=1;
                checkOwin();
                eight.setText("O");
            }
        }
    });




    }








    public void checkOwin() {
         Xturn = true;
        turn.setText("O TURN");
        if(Xarray[0]==1 && Xarray[1]==1 && Xarray[2]==1)
        {
            Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_LONG).show();
        }
        if(Xarray[3]==1 && Xarray[4]==1 && Xarray[5]==1)
        {
            Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_LONG).show();
        }
        if(Xarray[6]==1 && Xarray[7]==1 && Xarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_LONG).show();
        }
        if(Xarray[1]==1 && Xarray[4]==1 && Xarray[7]==1)
        {
            Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_LONG).show();
        }
        if(Xarray[2]==1 && Xarray[5]==1 && Xarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_LONG).show();
        }
        if(Xarray[0]==1 && Xarray[4]==1 && Xarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_LONG).show();
        }
        if(Xarray[2]==1 && Xarray[4]==1 && Xarray[6]==1)
        {
            Toast.makeText(MainActivity.this,"X WON",Toast.LENGTH_LONG).show();
        }
    }
    public void checkXwin(){
        Xturn = false;
        turn.setText("X TURN");
        if(Oarray[0]==1 && Oarray[1]==1 && Oarray[2]==1)
        {
            Toast.makeText(MainActivity.this,"O WON",Toast.LENGTH_LONG).show();
        }
        if(Oarray[3]==1 && Xarray[4]==1 && Oarray[5]==1)
        {
            Toast.makeText(MainActivity.this,"O WON",Toast.LENGTH_LONG).show();
        }
        if(Oarray[6]==1 && Oarray[7]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O WON",Toast.LENGTH_LONG).show();
        }
        if(Oarray[1]==1 && Oarray[4]==1 && Oarray[7]==1)
        {
            Toast.makeText(MainActivity.this,"O WON",Toast.LENGTH_LONG).show();
        }
        if(Oarray[2]==1 && Oarray[5]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O WON",Toast.LENGTH_LONG).show();
        }
        if(Oarray[0]==1 && Oarray[4]==1 && Oarray[8]==1)
        {
            Toast.makeText(MainActivity.this,"O WON",Toast.LENGTH_LONG).show();
        }
        if(Oarray[2]==1 && Oarray[4]==1 && Oarray[6]==1)
        {
            Toast.makeText(MainActivity.this,"O WON",Toast.LENGTH_LONG).show();
        }
    }

    }