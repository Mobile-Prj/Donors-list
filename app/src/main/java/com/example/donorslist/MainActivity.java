package com.example.donorslist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<DonorsList> items = new ArrayList<DonorsList>();
        items.add(new DonorsList("A+ Donor","Full Name : abbasy soukaina","Phone : +212650065744","City : Marrakech",R.drawable.ic_profile));
        items.add(new DonorsList("AB+ Donor","Full Name : Sara Chakir","Phone : +212650065744","City : Rabat",R.drawable.ic_profile));
        items.add(new DonorsList("A- Donor","Full Name : Yassmin Kardad","Phone : +212650065744","City : Safi",R.drawable.ic_profile));
        items.add(new DonorsList("A+ Donor","Full Name : el abbasy soukaina","Phone : +212650065744","City : Marrakech",R.drawable.ic_profile));
        items.add(new DonorsList("B+ Donor","Full Name : el abbasy soukaina","Phone : +212650065744","City : Marrakech",R.drawable.ic_profile));
        items.add(new DonorsList("O+ Donor","Full Name : el abbasy soukaina","Phone : +212650065744","City : Rabat",R.drawable.ic_profile));
        items.add(new DonorsList("AB- Donor","Full Name : el abbasy soukaina","Phone : +212650065744","City : Safi",R.drawable.ic_profile));
        items.add(new DonorsList("A+ Donor","Full Name : el abbasy soukaina","Phone : +212650065744","City : Marrakech",R.drawable.ic_profile));






        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DonorsAdapter(getApplicationContext(),items));

    }
}