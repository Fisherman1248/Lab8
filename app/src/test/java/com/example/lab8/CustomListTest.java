package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;



public class CustomListTest {
    private CustomList list;

    /**
     * Initializes a mock list of cities before each test.
     */
    @BeforeEach
    public void setup() {
        list = MockCityList();
    }

    /**
     * MockCityList method creates a mock list for testing purposes.
     */
    public CustomList MockCityList() {
        return new CustomList(null, new ArrayList<>());
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }


}
