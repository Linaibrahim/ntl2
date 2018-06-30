package com.example.pcworld.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        ListView listView = (ListView) findViewById(R.id.list2);
        ArrayList<DetailsList> arraylist = new ArrayList<DetailsList>();
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res1)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res2)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res3)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res4)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res5)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res6)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res7)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res8)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.res1)));
        GuideAdapter Adapter = new GuideAdapter(this, arraylist);
        listView.setAdapter(Adapter);
    }
}
