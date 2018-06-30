package com.example.pcworld.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Shops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);
        ListView listView = (ListView) findViewById(R.id.list3);
        ArrayList<DetailsList> arraylist = new ArrayList<DetailsList>();
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh1)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh2)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh3)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh4)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh5)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh6)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh7)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh8)));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.sh1)));
        GuideAdapter Adapter = new GuideAdapter(this, arraylist);
        listView.setAdapter(Adapter);
    }
}
