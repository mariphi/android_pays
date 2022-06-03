package com.doranco.flash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.hardware.lights.LightState;
import android.os.Bundle;

import com.doranco.flash.adapter.SpecialiteAdapter;
import com.doranco.flash.models.Specialite;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Specialite spec1 = new Specialite("Software developper");
        Specialite spec2 = new Specialite("Software engineer");
        Specialite spec3 = new Specialite("Software manager");
        Specialite spec4 = new Specialite("Software scientist");
        Specialite spec5 = new Specialite("Software javascript");


        List<Specialite> specList = Arrays.asList(spec1,spec2,spec3,spec4,spec5);



        RecyclerView recyclerView = findViewById(R.id.recyclerViewSpecialite);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new SpecialiteAdapter(specList));
    }
}