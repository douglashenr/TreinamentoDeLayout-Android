package com.dhsoftware.treinamentodelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.dhsoftware.treinamentodelayout.util.ExemploTelaLoginFragment;
import com.google.android.material.appbar.MaterialToolbar;


public class MainActivity extends AppCompatActivity implements MaterialToolbar.OnMenuItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new ExemploTelaLoginFragment()).commit();


    }

    @Override
    protected void onResume() {
        super.onResume();
        MaterialToolbar materialToolbar = findViewById(R.id.topAppBar);
        materialToolbar.setOnMenuItemClickListener(this);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Toast.makeText(getApplicationContext(), "Settings selecionado", Toast.LENGTH_LONG).show();
        return false;
    }
}