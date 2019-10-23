package com.example.androidchangetime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bt = findViewById(R.id.bt_change);
        final TextView MTextField = findViewById(R.id.tv_show);

        Timer T = new Timer();
        T.scheduleAtFixedRate(new TimerTask() {
            int i;

            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        MTextField.setText("count=" + i);
                        i++;
                    }
                });
            }
        }, 1000, 1000);
    }

}
