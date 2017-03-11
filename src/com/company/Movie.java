package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Movie {
    private String mTitle;

    public Movie(String title) {
        mTitle = title;
    }

    public String getPlot(){
        return "No Plot here";
    }

    public String getTitle() {
        return mTitle;
    }
}
