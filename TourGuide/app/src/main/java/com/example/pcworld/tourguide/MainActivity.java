package com.example.pcworld.tourguide;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button history;
    Button restaurant;
    Button shop;
    Button transportation;
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        history= (Button) findViewById(R.id.History);
        restaurant= (Button) findViewById(R.id.Restaurant);
        shop= (Button) findViewById(R.id.Shop);
        transportation= (Button) findViewById(R.id.Transportation);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.main);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivity1 = new Intent(MainActivity.this, HistoricalPlaces.class);
                startActivity(listActivity1);
            }
        });
        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivity2 = new Intent(MainActivity.this, Restaurants.class);
                startActivity(listActivity2);
            }
        });
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivity3 = new Intent(MainActivity.this,Shops.class);
                startActivity(listActivity3);
            }
        });
        transportation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivity4 = new Intent(MainActivity.this,Transportation.class);
                startActivity(listActivity4);
            }
        });

        /*NavigationView navigation = (NavigationView) findViewById(R.id.navigation);
        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.button1: {
                        Intent hist = new Intent(MainActivity.this, HistoricalPlaces.class);
                        startActivity(hist);
                    }
                    break;
                    case R.id.button2: {
                         Intent rest = new Intent(MainActivity.this, Restaurants.class);
                        startActivity(rest);
                    }
                    break;
                    case R.id.button3: {
                           Intent shop = new Intent(MainActivity.this, Shops.class);
                           startActivity(shop);
                    }
                    break;
                    case R.id.button4: {
                        Intent tran = new Intent(MainActivity.this, Transportation.class);
                        startActivity(tran);
                    }
                    break;
                }
                return false;
            }
        });*/
    }
}
