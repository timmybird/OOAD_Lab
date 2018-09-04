package com.example.android.ooad_lab;

import java.util.ArrayList;

public class DummyDataFetcher implements ICityFetcher {
    private static final DummyDataFetcher ourInstance = new DummyDataFetcher();

    public static DummyDataFetcher getInstance() {
        return ourInstance;
    }

    public DummyDataFetcher() {
    }

    @Override
    public ArrayList<CityObject> fetch() {
        ArrayList<CityObject> cities = new ArrayList<>();
        cities.add(new CityObject("Göteborg", 700000));
        cities.add(new CityObject("Helsingborg", 350000));
        cities.add(new CityObject("Jönköping", 200000));
        cities.add(new CityObject("Linköping", 178000));
        cities.add(new CityObject("Malmö", 450000));
        cities.add(new CityObject("Norrköping", 340000));
        return cities;
    }
}
