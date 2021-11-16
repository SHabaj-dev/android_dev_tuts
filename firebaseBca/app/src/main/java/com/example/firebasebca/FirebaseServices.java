package com.example.firebasebca;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirebaseServices {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public void getData(String currentSem){

        db.collection("subjects")
                .whereEqualTo("semester", currentSem)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            ArrayList<HashMap> DataList = new ArrayList<HashMap>();
                            for (QueryDocumentSnapshot document : task.getResult()) {
//                                DataList.add((HashMap) document.getData());
                                System.out.println(document.getData().get("name"));
                                System.out.println(document.getData().get("semester"));
                            }
//                            Map temp = new HashMap();
//                            for(int i =0; i<DataList.size(); i++){
//                                temp = DataList.get(i);
//                                System.out.println(temp.get("name"));
//                                System.out.println(temp.get("semester"));
//                            }

                        } else {
//                            Log.w(TAG, "Error getting documents.", task.getException());
                            System.out.println("Error getting documents." + task.getException());

                        }

                    }
                });
    }
}
