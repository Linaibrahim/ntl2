package com.example.pcworld.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_places);
        ListView listView = (ListView) findViewById(R.id.list1);
        ArrayList<DetailsList> arraylist = new ArrayList<DetailsList>();
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.hist1), R.drawable.ca));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.hist2), R.drawable.egypt_alexandria_kom_el_dikka));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.hist3), R.drawable.alex));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.hist4), R.drawable.sta));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.hist5), R.drawable.montaza));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.hist6), R.drawable.mos));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.hist7), R.drawable.ja));
        arraylist.add(new DetailsList(getString(R.string.title), getString(R.string.hist8), R.drawable.ba));
        GuideAdapter Adapter = new GuideAdapter(this, arraylist);
        listView.setAdapter(Adapter);
    }
}
