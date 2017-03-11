package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String getPlot() {
        return "A shark eats lots of people";
    }
}
