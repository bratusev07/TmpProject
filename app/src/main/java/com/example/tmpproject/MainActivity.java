package com.example.tmpproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Vasya");
        arrayList.add("Vasya");
        arrayList.add("Vasya");
        arrayList.add("Vasya = programmer");
        arrayList.add("Vasya");
        arrayList.add("Vasya");
        arrayList.add("Vasya");

        listView.setAdapter(new MyBaseAdapter(arrayList, getApplicationContext()));
    }
}