package com.example.tmpproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<String> {

    private ArrayList<String> strings;

    public MyArrayAdapter(@NonNull Context context, int resource, ArrayList<String> strings) {
        super(context, resource);
        this.strings = strings;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String line = getItem(position).toString();

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.my_list_item, null);
        }

        ((Button)convertView.findViewById(R.id.button)).setText(line);

        return convertView;
    }
}
