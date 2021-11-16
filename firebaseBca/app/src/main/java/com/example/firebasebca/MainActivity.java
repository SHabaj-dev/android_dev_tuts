package com.example.firebasebca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sem1, sem2, sem3, sem4, sem5, sem6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sem1 = findViewById(R.id.textSem1);
        sem2 = findViewById(R.id.textSem2);
        sem3 = findViewById(R.id.textSem3);
        sem4 = findViewById(R.id.textSem4);
        sem5 = findViewById(R.id.textSem5);
        sem6 = findViewById(R.id.textSem6);


    // this is shabaj anasari testing git 2

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Semester = sem1.getText().toString();
                subject(Semester);
//                Toast.makeText(getApplicationContext(), Semester, Toast.LENGTH_SHORT).show();
            }
        });


        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Semester = sem2.getText().toString();
                subject(Semester);

//                Toast.makeText(getApplicationContext(), Semester, Toast.LENGTH_SHORT).show();
            }
        });


        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Semester = sem3.getText().toString();
                subject(Semester);
//                Toast.makeText(getApplicationContext(), Semester, Toast.LENGTH_SHORT).show();
            }
        });



        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Semester = sem4.getText().toString();
                subject(Semester);
//                Toast.makeText(getApplicationContext(), Semester, Toast.LENGTH_SHORT).show();
            }
        });



        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Semester = sem5.getText().toString();
                subject(Semester);
//                Toast.makeText(getApplicationContext(), Semester, Toast.LENGTH_SHORT).show();
            }
        });


        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Semester = sem6.getText().toString();
                subject(Semester);
//                Toast.makeText(getApplicationContext(), Semester, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void subject(String name){

        Intent intent = new Intent(getApplicationContext(), subject.class);
        intent.putExtra("semester", name);
        startActivity(intent);

    }


}