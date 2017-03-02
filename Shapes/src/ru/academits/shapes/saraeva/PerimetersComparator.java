package ru.academits.shapes.saraeva;

import java.util.Comparator;

/**
 * Created by Евгения on 02.03.2017.
 */


public class PerimetersComparator implements Comparator<Double> {

    @Override
    public int compare(Double o1, Double o2) {
        return o1.compareTo(o2);
    }
}


