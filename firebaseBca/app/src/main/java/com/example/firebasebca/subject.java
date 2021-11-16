package com.example.firebasebca;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class subject extends AppCompatActivity {
    String currentSem;
    FirebaseServices firebaseServices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);


        Intent intent = getIntent();
        currentSem = intent.getStringExtra("semester");
        getSupportActionBar().setTitle(currentSem);

        firebaseServices = new FirebaseServices();
        firebaseServices.getData(currentSem);


    }



}