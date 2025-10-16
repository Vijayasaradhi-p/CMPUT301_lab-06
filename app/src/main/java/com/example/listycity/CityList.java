package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if the city is in the list
     * @param city
     * Checks if this city exits
     * @return
     * Returns True if the city exists. Else False
     */
    public Boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list
     * @param city
     * The city that is to be deleted from the list
     */
    public void deleteCity(City city){
        if (cities.contains(city)) {
            cities.remove(city);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * Counts the number of cities in the list
     * @return
     * returns the count of cities
     */
    public int countCities(){
        return cities.size();
    }
}
