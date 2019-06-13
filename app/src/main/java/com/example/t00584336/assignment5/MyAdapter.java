package com.example.t00584336.assignment5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {
    private Item[] items;
    private  Context context;

    public MyAdapter(@NonNull Context context, int textViewresourceId, Item[] items) {
        super(context, textViewresourceId, items);
        this.items = items;
        this.context = context;
    }

//    public MyAdapter(ArrayList<Item> elements, Context applicationContext) {
//        super();
//        this.items = items;
//        this.context = applicationContext;
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v==null)
        {
            LayoutInflater vi = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.items_list_item,null);
        }

        Item it = items[position];
        if (it != null)
        {
            ImageView iv = (ImageView) v.findViewById(R.id.list_item);
            if (iv != null)
            {
                iv.setImageDrawable(Drawable.createFromPath(it.getImage()));
            }
        }
        return v;
    }
}
