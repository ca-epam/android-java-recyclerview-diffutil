package com.example.adrian.android_java_diffutil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rvList = (RecyclerView) findViewById(R.id.rvList);
        final Button btnSort = (Button) findViewById(R.id.btnSort);


        final List<Person> list = DataProvider.getOldPersonList();
        final PersonAdapter personAdapter = new PersonAdapter(list);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvList.setLayoutManager(mLayoutManager);
        rvList.setItemAnimator(new DefaultItemAnimator());
        rvList.setAdapter(personAdapter);

        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Person> newList = DataProvider.getNewPersonList();
                personAdapter.updateList((ArrayList<Person>) newList);
            }
        });


    }
}
