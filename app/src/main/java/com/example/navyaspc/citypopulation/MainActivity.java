package com.example.navyaspc.citypopulation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Population> populations = Query.extractPopulations();

        ListView PopulationListView = (ListView) findViewById(R.id.list);

        final PopulationAdapter adapter = new PopulationAdapter(this, populations);

        PopulationListView.setAdapter(adapter);
    }

}
