package com.example.examplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] listNegara = {"Indonesia", "Malaysia", "United State", "Russia", "China"};
    String[] listTips = {"Indonesia is a beautiful countries based on archipelagos territory, Indonesia is unique and have so many tribes, races, and culture.",
                        "Malaysian is known for the Twins Tower, and its capital Kuala Lumpur. they speak melayu.",
    "United States of america is consist of so many sub-Territory as example Kansas, New Mexico, Seattle and etc.",
    "Russian is cold countries has so many history, and its famous leader time by time like Vladimir Lenin, Joseph Stalin, Vladimir Lenin."
    ,"China secretly has so many secret undergoing in the country itself. Xi Jin Ping is the current president of China as of 2023."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.lvCountry);
        countryAdapter countryAdapter = new countryAdapter(getApplicationContext(), listNegara, listTips);
        listView.setAdapter(countryAdapter);

    }
}