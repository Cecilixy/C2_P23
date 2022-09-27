package com.example.c2_p23;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    ImageView light;
    TextView textView;
    Integer count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        light = (ImageView) findViewById(R.id.light);
        textView = (TextView) findViewById(R.id.textView);
        count = 1;

        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view){
        if (view.getId() == R.id.button){

            if (count.equals(1)){
                textView.setText("You can start walking");
                light.setBackgroundResource(R.drawable.green);
                count = 2;
            }
            else if (count.equals(2)){
                textView.setText("Please stop entering");
                light.setBackgroundResource(R.drawable.yellow);
                count = 3;
            }
            else if (count.equals(3)){
                textView.setText("STOP!");
                light.setBackgroundResource(R.drawable.red);

                count = 1;
            }

            }


        }
    }
