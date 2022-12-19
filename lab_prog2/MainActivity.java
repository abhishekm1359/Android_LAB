package com.example.second_lab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        Switch switch1 = findViewById(R.id.switch1);

        ConstraintLayout layout = findViewById(R.id.layout);
        CalendarView cal = new CalendarView(this);
        layout.addView(cal);
        switch1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(switch1.isChecked()){
                    button.setEnabled(true);
                    layout.removeView(cal);
                    Toast.makeText(MainActivity.this, "Button is Enabled" , Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this , "Button is Disabled" , Toast.LENGTH_LONG).show();

                    button.setEnabled(false);
                    layout.addView(cal);
                }
            }
        });


    }
}