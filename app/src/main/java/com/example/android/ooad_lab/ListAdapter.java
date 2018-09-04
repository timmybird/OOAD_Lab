package com.example.android.ooad_lab;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private ArrayList<CityObject> dataSet;

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView cityName;
        TextView cityPopulation;

        ViewHolder(View view) {
            super(view);
            cityName = view.findViewById(R.id.tvCityName);
            cityPopulation = view.findViewById(R.id.tvCityPopulation);
        }
    }

    ListAdapter(ArrayList<CityObject> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        CityObject city = dataSet.get(position);
        holder.cityName.setText(city.getName());
        holder.cityPopulation.setText(Integer.toString(city.getPopulation()));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
