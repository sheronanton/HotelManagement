package com.realapks.hotelmanagement;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    int[] minteger = new int[7];
    HashMap<Integer,Integer> ids= null;
    public void increaseInteger(View view) {
        String row_number = view.getTag().toString();
        int rn = 0;
        try{
            rn = Integer.parseInt(row_number);
            rn--;
        }catch(Exception e){
            Log.d(e.getMessage(),null);
        }
        minteger[rn] = minteger[rn] + 1;
        display(minteger,++rn);

    }public void decreaseInteger(View view) {
        String row_number = view.getTag().toString();
        int rn = 0;
        try{
            rn = Integer.parseInt(row_number);
            rn--;
        }catch(Exception e){
            Log.d(e.getMessage(),null);
        }
        minteger[rn] = minteger[rn] - 1;
        display(minteger,++rn);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shelton);
        ids = new HashMap<Integer, Integer>();
        ids.put(1,R.id.number1);
        ids.put(2,R.id.number2);
        ids.put(3,R.id.number3);
        ids.put(4,R.id.number4);
        ids.put(5,R.id.number5);
        ids.put(6,R.id.number6);
        ids.put(7,R.id.number7);
    }

    public void display(int[] number,int index) {
        TextView displayInteger =(TextView)findViewById(ids.get(index));
        displayInteger.setText("" + number[index-1]);
    }
}

