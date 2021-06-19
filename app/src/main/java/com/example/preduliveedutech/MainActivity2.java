package com.example.preduliveedutech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        getSupportActionBar().hide();

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent intent =  new Intent(MainActivity2.this , MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }; thread.start();

    }
}