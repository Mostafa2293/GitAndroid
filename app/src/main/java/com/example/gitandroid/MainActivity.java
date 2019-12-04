package com.example.gitandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private boolean flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.txtHelloWorld);
        txtHiWorld = findViewById(R.id.txtHiWorld);


        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {

                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    txtHiWorld.animate().alpha(1).setDuration(3000);
                    flag = false;
                } else {

                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    txtHiWorld.animate().alpha(0).setDuration(3000);
                    flag = true;

                }
            }
        });


    }


}
