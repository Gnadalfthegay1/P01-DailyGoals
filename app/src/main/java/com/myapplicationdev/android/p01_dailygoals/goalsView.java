package com.myapplicationdev.android.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class goalsView extends AppCompatActivity {
    Button btDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals_view);
        btDone = findViewById(R.id.finish);
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String info = i.getStringExtra("info");
        String c1 = i.getStringExtra("rb1");
        String c2 = i.getStringExtra("rb2");
        String c3 = i.getStringExtra("rb3");
        // Get the TextView object
        TextView tv1 = findViewById(R.id.textView8);
        TextView tv2 = findViewById(R.id.textView9);
        TextView tv3 = findViewById(R.id.textView10);
        TextView tv4 = findViewById(R.id.textView11);
        // Display the name and age on the TextView
        tv1.setText("Read up on material before class: "+ c1);
        tv2.setText("Arrive on time so as not to miss important part of the lesson: "+ c2);
        tv3.setText("Attempt the problem myself: "+ c3);
        tv4.setText("Reflection: "+ info);
        btDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(goalsView.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
