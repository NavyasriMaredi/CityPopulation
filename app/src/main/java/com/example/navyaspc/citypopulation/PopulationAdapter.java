package com.example.navyaspc.citypopulation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Navya's PC on 1/25/2017.
 */

public class PopulationAdapter extends ArrayAdapter<Population> {

    public PopulationAdapter(Context context, List<Population> populations){
        super(context, 0, populations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View poplistview = convertView;
        if(poplistview == null){
            poplistview = LayoutInflater.from(getContext()).inflate(R.layout.listlayout, parent, false);
        }

        Population currentpopulation = getItem(position);

        TextView countrycodeView = (TextView) poplistview.findViewById(R.id.countrycode);
        countrycodeView.setText(currentpopulation.getMcountryCode());

        TextView citynameView = (TextView) poplistview.findViewById(R.id.cityname);
        citynameView.setText(currentpopulation.getMcityName());

        TextView populationView = (TextView) poplistview.findViewById(R.id.population);
        populationView.setText(currentpopulation.getMpopulation());

        return poplistview;
    }
}
