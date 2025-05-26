package com.example.pas_2_22;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SiswaAdapter adapter;
    private List<Siswa> siswaList;
    private GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile);

        recyclerView = findViewById(R.id.recyclerViewSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        siswaList = new ArrayList<>();

        siswaList.add(new Siswa("Aldikky Arfian Susanto", "2", R.drawable.avatar));
        siswaList.add(new Siswa("Muhammad Febrian", "22", R.drawable.avatar));

        adapter = new SiswaAdapter((ArrayList<Siswa>) siswaList);
        recyclerView.setAdapter(adapter);

        mGestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });


    }
};
