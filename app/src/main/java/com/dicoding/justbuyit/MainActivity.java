package com.dicoding.justbuyit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Stuff> list = new ArrayList<>();
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(StuffData.getListData());
        showRecyclerCard();
        Log.d(TAG, "onCreate: ");

    }

    private void showRecyclerCard() {
            rvCategory.setLayoutManager(new LinearLayoutManager(this));
            CardViewStuffAdapter cardViewStuffAdapter = new CardViewStuffAdapter(list);
            rvCategory.setAdapter(cardViewStuffAdapter);
        Log.d(TAG, "showRecyclerCard: ");
    }
}

