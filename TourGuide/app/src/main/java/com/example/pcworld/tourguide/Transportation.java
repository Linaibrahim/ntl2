package com.example.pcworld.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Transportation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation);
        ListView listView = (ListView) findViewById(R.id.list4);
        ArrayList<DetailsList> arraylist = new ArrayList<DetailsList>();
        arraylist.add(new DetailsList(getString(R.string.title1), getString(R.string.tra1)));
        arraylist.add(new DetailsList(getString(R.string.title1), getString(R.string.tra2)));
        arraylist.add(new DetailsList(getString(R.string.title1), getString(R.string.tra3)));
        arraylist.add(new DetailsList(getString(R.string.title1), getString(R.string.tra4)));
        arraylist.add(new DetailsList(getString(R.string.title1), getString(R.string.tra5)));
        GuideAdapter Adapter = new GuideAdapter(this, arraylist);
        listView.setAdapter(Adapter);
    }
}
