package com.example.t00584336.assignment5;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = loadJSONFromAsset();

        try {
            JSONObject rootObject = new JSONObject(json);
            JSONArray jsonArray = rootObject.getJSONArray("items");
            for (int i=0; i < jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Log.v("potato", "Actual Element Name: " + jsonObject.get("id") + " " + jsonObject.get("name"));

                ListView listView = (ListView) findViewById(R.id.pictureview);

                final ArrayList<Item> elements = new ArrayList<>();

                //pictureview.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,jsonArray));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
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
