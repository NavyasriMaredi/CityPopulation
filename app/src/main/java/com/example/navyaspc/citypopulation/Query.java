package com.example.navyaspc.citypopulation;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Navya's PC on 1/25/2017.
 */

public class Query {

    public final static String JSON_DATA = "{\"geonames\":[{\"lng\":-99.12766456604,\"geonameId\":3530597,\"countrycode\":\"MX\",\"name\":\"Mexiko-Stadt\",\"fclName\":\"city, village,...\",\"toponymName\":\"Mexico City\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"en.wikipedia.org/wiki/Mexico_City\",\"lat\":19.428472427036,\"fcl\":\"P\",\"population\":12294193,\"fcode\":\"PPLC\"},{\"lng\":116.397228240967,\"geonameId\":1816670,\"countrycode\":\"CN\",\"name\":\"Peking\",\"fclName\":\"city, village,...\",\"toponymName\":\"Beijing\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"en.wikipedia.org/wiki/Beijing\",\"lat\":39.9074977414405,\"fcl\":\"P\",\"population\":11716620,\"fcode\":\"PPLC\"},{\"lng\":90.40743827819824,\"geonameId\":1185241,\"countrycode\":\"BD\",\"name\":\"Dhaka\",\"fclName\":\"city, village,...\",\"toponymName\":\"Dhaka\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"en.wikipedia.org/wiki/Dhaka\",\"lat\":23.710395616597037,\"fcl\":\"P\",\"population\":10356500,\"fcode\":\"PPLC\"},{\"lng\":126.9784,\"geonameId\":1835848,\"countrycode\":\"KR\",\"name\":\"Seoul\",\"fclName\":\"city, village,...\",\"toponymName\":\"Seoul\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"en.wikipedia.org/wiki/Seoul\",\"lat\":37.566,\"fcl\":\"P\",\"population\":10349312,\"fcode\":\"PPLC\"},{\"lng\":106.84513092041016,\"geonameId\":1642911,\"countrycode\":\"ID\",\"name\":\"Jakarta\",\"fclName\":\"city, village,...\",\"toponymName\":\"Jakarta\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"en.wikipedia.org/wiki/Jakarta\",\"lat\":-6.214623197035775,\"fcl\":\"P\",\"population\":8540121,\"fcode\":\"PPLC\"},{\"lng\":139.69171,\"geonameId\":1850147,\"countrycode\":\"JP\",\"name\":\"Tokyo\",\"fclName\":\"city, village,...\",\"toponymName\":\"Tokyo\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"de.wikipedia.org/wiki/Tokyo\",\"lat\":35.6895,\"fcl\":\"P\",\"population\":8336599,\"fcode\":\"PPLC\"},{\"lng\":121.531846,\"geonameId\":1668341,\"countrycode\":\"TW\",\"name\":\"Taipeh\",\"fclName\":\"city, village,...\",\"toponymName\":\"Taipei\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"de.wikipedia.org/wiki/Taipei\",\"lat\":25.047763,\"fcl\":\"P\",\"population\":7871900,\"fcode\":\"PPLC\"},{\"lng\":-74.08175468444824,\"geonameId\":3688689,\"countrycode\":\"CO\",\"name\":\"Bogotá\",\"fclName\":\"city, village,...\",\"toponymName\":\"Bogotá\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"en.wikipedia.org/wiki/Bogot%C3%A1\",\"lat\":4.609705849789108,\"fcl\":\"P\",\"population\":7674366,\"fcode\":\"PPLC\"},{\"lng\":114.157691001892,\"geonameId\":1819729,\"countrycode\":\"HK\",\"name\":\"Hongkong\",\"fclName\":\"city, village,...\",\"toponymName\":\"Hong Kong\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"en.wikipedia.org/wiki/Hong_Kong\",\"lat\":22.2855225817732,\"fcl\":\"P\",\"population\":7012738,\"fcode\":\"PPLC\"},{\"lng\":100.501444,\"geonameId\":1609350,\"countrycode\":\"TH\",\"name\":\"Bangkok\",\"fclName\":\"city, village,...\",\"toponymName\":\"Bangkok\",\"fcodeName\":\"capital of a political entity\",\"wikipedia\":\"en.wikipedia.org/wiki/Bangkok\",\"lat\":13.753979,\"fcl\":\"P\",\"population\":5104476,\"fcode\":\"PPLC\"}]}";

    public Query() {
    }

    public static ArrayList<Population> extractPopulations(){
        ArrayList<Population> populations = new ArrayList<>();

        try{
            JSONObject Root = new JSONObject(JSON_DATA);
            JSONArray geonames = Root.getJSONArray("geonames");
            for(int i=0; i<geonames.length(); i++){
                JSONObject indexobject = geonames.getJSONObject(i);
                String countrycode = indexobject.getString("countrycode");
                String cityname = indexobject.getString("toponymName");
                int population = indexobject.getInt("population");


                populations.add(new Population(countrycode, cityname, population));
            }

        }
        catch (JSONException e){
            Log.e("Query", "problem duting JSON parsing");
        }

        return populations;
    }


}
