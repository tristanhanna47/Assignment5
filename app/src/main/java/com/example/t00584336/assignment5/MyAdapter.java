package com.example.t00584336.assignment5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ArrayList<Item> items = new ArrayList<Item>();
        MyAdapter adapter = new MyAdapter(this, items);

        Item item = new Item("name", "0");
        adapter.add(item);

        return super.getView(position, convertView, parent);


    }

    public MyAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
