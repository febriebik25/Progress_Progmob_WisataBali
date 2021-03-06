package com.example.destinasiwisatabali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Bangli extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Wisata> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangli);
        rvCategory = findViewById(R.id.Bangli);
        rvCategory.setHasFixedSize(true);

        list.addAll(BangliData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListKabupatenAdapter listKabupatenAdapter = new ListKabupatenAdapter(this);
        listKabupatenAdapter.setListWisata(list);
        rvCategory.setAdapter(listKabupatenAdapter);
    }
}
