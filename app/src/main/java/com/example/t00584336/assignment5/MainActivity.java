package com.example.t00584336.assignment5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
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

                elements.add(new Item(R.drawable.banana, "Banana"));

                ArrayAdapter<Item> adapter = new ArrayAdapter<Item>(this,android.R.layout.simple_expandable_list_item_1,elements);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        switch (position)
                        {
                            case 0:
                                Intent intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 1:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 2:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 3:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 4:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 5:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 6:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 7:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 8:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;
                            case 9:
                                intent = new Intent (view.getContext(),BananaActivity.class);
                                startActivity(intent);
                                break;



                        }


                    }
                });
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
