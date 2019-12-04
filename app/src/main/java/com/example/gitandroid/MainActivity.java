package com.example.gitandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Mytag","Msg1");
        Log.i("Mytag","Msg2");

        System.out.println("Hello");


    }

    private void test() {
        Log.i("Method","this is the new branch MethodOne !!");
    }
}
