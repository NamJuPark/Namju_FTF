package com.example.namju_flytofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Show_Exercise extends AppCompatActivity {
    ListView listView;
    Adapter_Show_Exercise adapter;
    ArrayList<item_Exercise> exerciseData = new ArrayList<item_Exercise>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show__exercise);
        init();
    }

    private void init() {
        listView = (ListView)findViewById(R.id.listView);
        //어댑터 생성
        adapter = new Adapter_Show_Exercise(exerciseData,this);
        listView.setAdapter(adapter);
        item_Exercise one = new item_Exercise(R.drawable.arm, "운동이름", "운동설명");
        exerciseData.add(one);
        exerciseData.add(one);
        exerciseData.add(one);
        adapter.notifyDataSetChanged();
    }
}
