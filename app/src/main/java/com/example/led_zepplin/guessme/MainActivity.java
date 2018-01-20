package com.example.led_zepplin.guessme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void guess(View view){
        Log.i("info","Button pressed");

        Random rand = new Random();
        int  storeRand=rand.nextInt(10)+1;

       // String storeRand=Integer.toString(i);




        Log.i("Values", Integer.toString(storeRand));


        EditText text = (EditText) findViewById(R.id.inputText);
        String Input=text.getText().toString();
        int storeInput=Integer.parseInt(Input);

       // String message;
        if(storeInput>storeRand){
            Toast.makeText(this, storeInput+" is greater than number", Toast.LENGTH_SHORT).show();
        }else if(storeInput<storeRand){
            Toast.makeText(this, storeInput+" is smaller than number", Toast.LENGTH_SHORT).show();

        }else if(storeInput==storeRand){
            Toast.makeText(this, "Bingo"+storeInput+" is equal to "+storeRand, Toast.LENGTH_SHORT).show();
        }

        if(storeInput>storeRand)
        Log.i("Values",text.getText().toString());






    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
