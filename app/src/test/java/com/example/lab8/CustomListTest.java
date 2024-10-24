package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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

    @Test
    public void hasCityTest() {
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));  // Expect to fail since hasCity isn't implemented yet

        City cityNotInList = new City("Calgary", "AB");
        assertFalse(list.hasCity(cityNotInList));  // Expect to fail
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Estevan", "SK");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);  // Expect to fail since deleteCity isn't implemented yet
        assertEquals(list.getCount(), listSize - 1);
        assertFalse(list.hasCity(city));  // Expect to fail
    }

    @Test
    public void countCitiesTest() {
        assertEquals(0, list.countCities());  // Expect to fail since countCities isn't implemented yet
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Calgary", "AB"));
        assertEquals(2, list.countCities());  // Expect to fail
    }

}
