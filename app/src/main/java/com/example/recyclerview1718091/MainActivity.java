package com.example.recyclerview1718091;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuisrecyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void tambahData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Misaman","Ayah",getDrawable(R.drawable.a3)));
        keluargaArrayList.add(new Keluarga("Sami","Ibu",getDrawable(R.drawable.a2)));
        keluargaArrayList.add(new Keluarga("Habib Khoirul Muwahidin","Anak",getDrawable(R.drawable.a1)));
    }
}
