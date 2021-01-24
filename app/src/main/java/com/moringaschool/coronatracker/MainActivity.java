package com.moringaschool.coronatracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.RequestQueue;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<CoronaItem> coronaItemArrayList;
    private RequestQueue requestQueue;
    private TextView dailyDeaths, dailyConfirm, dailReco, dateHeaders, totalDeath, totalConfirm, totalRecovered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dailyConfirm=findViewById(R.id.dailyConfirmed);
        dailyDeaths=findViewById(R.id.dailyDeath);
        dailReco=findViewById(R.id.dailyRecovered);
        dateHeaders=findViewById(R.id.dateHeader);
        totalRecovered=findViewById(R.id.todayRecovered);
        totalConfirm=findViewById(R.id.totalConfirmed);
        totalConfirm=findViewById(R.id.totalDeath);

        recyclerView=findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}