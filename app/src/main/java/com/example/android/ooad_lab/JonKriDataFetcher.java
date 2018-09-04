package com.example.android.ooad_lab;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class JonKriDataFetcher implements ICityFetcher {
    OkHttpClient client = new OkHttpClient();
    String address = "http://cities.jonkri.se/";

    @Override
    public ArrayList<CityObject> fetch() {
        Async async = new Async();
        async.execute();
        return null;
    }

    private void getit() {
        URL url = null;
        try {
            url = new URL(address);
            Request request = new Request.Builder().url(url).build();
            Response response = client.newCall(request).execute();
            System.out.print(response);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Async extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            getit();
            return null;
        }
    }
}
