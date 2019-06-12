package com.example.t00584336.assignment5;

import android.app.Activity;
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
                Item e1 = new Item("Banana","R.id.Banana");
                Item e2 = new Item("Books","R.id.Books");
                Item e3 = new Item("Cheese","R.id.Cheese");
                Item e4 = new Item("Cherry","R.id.Cherry");
                Item e5 = new Item("Donkey","R.id.Donkey");
                Item e6 = new Item("Doughnut","R.id.Doughnut");
                Item e7 = new Item("King","R.id.King");
                Item e8 = new Item("Money","R.id.Money");
                Item e9 = new Item("Moose","R.id.Moose");
                Item e10 = new Item("Orange","R.id.Orange");
                Item e11 = new Item("Peace","R.id.Peace");
                Item e12 = new Item("Pig","R.id.Pig");
                Item e13 = new Item("Potato","R.id.Potato");
                Item e14 = new Item("Sheep","R.id.Sheep");
                Item e15 = new Item("Travel","R.id.Travel");
                Item e16 = new Item("Tree","R.id.Tree");
                Item e17 = new Item("World","R.id.World");
                Item e18 = new Item("Yoga","R.id.Yoga");

                elements.add(e1);
                elements.add(e2);
                elements.add(e3);
                elements.add(e4);
                elements.add(e5);
                elements.add(e6);
                elements.add(e7);
                elements.add(e8);
                elements.add(e9);
                elements.add(e10);
                elements.add(e11);
                elements.add(e12);
                elements.add(e13);
                elements.add(e14);
                elements.add(e15);
                elements.add(e16);
                elements.add(e17);
                elements.add(e18);

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
                                Toast.makeText(getApplicationContext(), "I am Banana", Toast.LENGTH_LONG);
                                break;
                            case 1:
                                intent = new Intent (view.getContext(),BooksActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am a Book", Toast.LENGTH_LONG);
                                break;
                            case 2:
                                intent = new Intent (view.getContext(),CheeseActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am Cheese", Toast.LENGTH_LONG);
                                break;
                            case 3:
                                intent = new Intent (view.getContext(),CherryActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am a Cherry", Toast.LENGTH_LONG);
                                break;
                            case 4:
                                intent = new Intent (view.getContext(),DonkeyActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am a Donkey", Toast.LENGTH_LONG);
                                break;
                            case 5:
                                intent = new Intent (view.getContext(),DoughnutActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am a Doughnut", Toast.LENGTH_LONG);
                                break;
                            case 6:
                                intent = new Intent (view.getContext(),KingActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am a King", Toast.LENGTH_LONG);
                                break;
                            case 7:
                                intent = new Intent (view.getContext(),MoneyActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am Money", Toast.LENGTH_LONG);
                                break;
                            case 8:
                                intent = new Intent (view.getContext(),MooseActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am a Moose", Toast.LENGTH_LONG);
                                break;
                            case 9:
                                intent = new Intent (view.getContext(),OrangeActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am an Orange", Toast.LENGTH_LONG);
                                break;
                            case 10:
                                intent = new Intent (view.getContext(),PeaceActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am Peace", Toast.LENGTH_LONG);
                                break;
                            case 11:
                                intent = new Intent (view.getContext(),PigActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am a Pig", Toast.LENGTH_LONG);
                                break;
                            case 12:
                                intent = new Intent (view.getContext(),PotatoActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am Potato", Toast.LENGTH_LONG);
                                break;
                            case 13:
                                intent = new Intent (view.getContext(),SheepActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am a Sheep", Toast.LENGTH_LONG);
                                break;
                            case 14:
                                intent = new Intent (view.getContext(),TravelActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am Travel", Toast.LENGTH_LONG);
                                break;
                            case 15:
                                intent = new Intent (view.getContext(),TreeActivity.class);
                                Toast.makeText(getApplicationContext(), "I am a Tree", Toast.LENGTH_LONG);
                                startActivity(intent);
                                break;
                            case 16:
                                intent = new Intent (view.getContext(),WorldActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am the World", Toast.LENGTH_LONG);
                                break;
                            case 17:
                                intent = new Intent (view.getContext(),YogaActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(), "I am Yoga", Toast.LENGTH_LONG);
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
