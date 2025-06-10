package com.example.pas_2_22;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileFragment extends Fragment {

    private RecyclerView recyclerView;
    private SiswaAdapter siswaAdapter;
    private ArrayList<Siswa> siswaList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Prepare data for the RecyclerView
        siswaList = new ArrayList<>();
        siswaList.add(new Siswa("Aldikky Arfian Susanto", "02", R.drawable.img_neko));
        siswaList.add(new Siswa("Muhammad Febrian", "22", R.drawable.img_amate));

        // Initialize and set the adapter
        siswaAdapter = new SiswaAdapter(siswaList);
        recyclerView.setAdapter(siswaAdapter);

        return view;
    }
}
