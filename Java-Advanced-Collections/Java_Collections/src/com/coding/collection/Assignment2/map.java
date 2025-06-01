package com.coding.collection.Assignment2;

import com.coding.collection.helper.UserInput;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India", "New Delhi");
        map.put("U.A.E", "Abu Dhabi");
        map.put("U.S.A", "Washington D.C");
        map.put("China", "Beijing");
        map.put("Oman", "Muscat");
        System.out.println("Country Capital Map : " + map);
        String countryName = UserInput.userInput("Enter Country");
        getCapital(map, countryName);
    }

    public static void getCapital(Map<String, String> map, String countryName) {
        String capital = "";
        capital = map.get(countryName);
        System.out.printf("Capital of the country %s is %s", countryName, capital);
    }
}
