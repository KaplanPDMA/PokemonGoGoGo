package com.kaplan.pdma.pokemongogogo;

/**
 * Created by wku on 11/1/2016.
 */

public class Pokemon {
    String name;
    int image;
    String[] options;

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String[] getOptions() {
        return options;
    }

    public Pokemon(String name, int image, String[] options) {
        this.name = name;
        this.image = image;
        this.options = options;
    }

}
