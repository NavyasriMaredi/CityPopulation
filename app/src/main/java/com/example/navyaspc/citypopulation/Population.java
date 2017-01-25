package com.example.navyaspc.citypopulation;

/**
 * Created by Navya's PC on 1/25/2017.
 */

public class Population {
    private String mcountryCode;
    private String mcityName;
    private int mpopulation;

    public Population(String countryCode, String cityName, int population){
        mcountryCode = countryCode;
        mcityName = cityName;
        mpopulation = population;
    }

    public String getMcountryCode() {
        return mcountryCode;
    }

    public void setMcountryCode(String mcountryCode) {
        this.mcountryCode = mcountryCode;
    }

    public String getMcityName() {
        return mcityName;
    }

    public void setMcityName(String mcityName) {
        this.mcityName = mcityName;
    }

    public int getMpopulation() {
        return mpopulation;
    }

    public void setMpopulation(int mpopulation) {
        this.mpopulation = mpopulation;
    }
}
