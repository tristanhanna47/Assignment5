package com.example.t00584336.assignment5;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends Activity {

    final ArrayList<Item> elements = new ArrayList<>();
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = loadJSONFromAsset();

        try {
            JSONObject rootObject = new JSONObject(json);
            JSONArray jsonArray = rootObject.getJSONArray("items");

            for (int i=0; i < jsonArray.length();i++)
            {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Log.v("potato", "Actual Element Name: " + jsonObject.get("id") + " " + jsonObject.get("name"));

                Item item = new Item(jsonObject.getString("name"), jsonObject.getString("image"));
                elements.add(item);
            }
            this.adapter = new MyAdapter(this, R.layout.items_list_item, ItemManager.getLoadedItems());
            setListAdapter(this.adapter);

            ListView listView = (ListView) findViewById(R.id.pictureview);
            ArrayAdapter<Item> adapter = new ArrayAdapter<Item>(this,android.R.layout.simple_expandable_list_item_1,elements);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    }
                });
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    private void setListAdapter(MyAdapter adapter) {

    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = this.getAssets().open("items.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
