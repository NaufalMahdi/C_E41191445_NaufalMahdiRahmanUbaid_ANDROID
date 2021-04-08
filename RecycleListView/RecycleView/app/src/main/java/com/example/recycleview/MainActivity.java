package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView viewRec;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();
        viewRec = (RecyclerView) findViewById(R.id.recycle_view);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        viewRec.setLayoutManager(layoutManager);
        viewRec.setAdapter(adapter);
    }

    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Rahadian Nugraha","E41191450","081908756443"));
        mahasiswaArrayList.add(new Mahasiswa("Naufal Mahdi Rahman Ubaid","E41191445","085827389999"));
        mahasiswaArrayList.add(new Mahasiswa("Alfian Septy Chandra W","E41191832","08123457831"));
        mahasiswaArrayList.add(new Mahasiswa("Muhammad Wildan Hakim","E41191897","085336541241"));
        mahasiswaArrayList.add(new Mahasiswa("Nadea Ajeng Safitri","E41191903","085398084241"));
        mahasiswaArrayList.add(new Mahasiswa("Aji Wicaksono","E41191405","081281334241"));
        mahasiswaArrayList.add(new Mahasiswa("Atala Ilyasa","E41191649","081910297382"));
    }
}