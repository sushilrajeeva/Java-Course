package com.coding.collection.List;

import java.util.ArrayList;
import java.util.List;

public class TestingList {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("Sushil");
        strList.add("Nikhil");
        strList.add("Jaswant");

        for (String s : strList) {
            System.out.printf("Name : %s \n", s);
        }

        if (strList.contains("Jaswant")) {
            System.out.printf("Jaswant exist in the list at index : %d \n", strList.indexOf("Jaswant"));
        }
    }

}
