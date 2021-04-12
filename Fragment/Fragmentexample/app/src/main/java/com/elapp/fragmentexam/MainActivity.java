package com.elapp.fragmentexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.elapp.fragmentexam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Button btnFragmentPertama;
    private Button btnFragmentKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragmentPertama = findViewById(R.id.btn_first_page);
        btnFragmentKedua = findViewById(R.id.btn_second_page);

        btnFragmentPertama.setOnClickListener(v -> loadFragment(new FirstFragment()));
        btnFragmentKedua.setOnClickListener(v -> loadFragment(new SecondFragment()));

    }

    private void loadFragment(Fragment fragment) {
        //perbedaan dengan BKPM nya adalah kita menggunakan supportFragmentManager
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (fragment != null) {
            transaction.replace(R.id.frame_layout, fragment);
            transaction.commit();
        }
    }

}