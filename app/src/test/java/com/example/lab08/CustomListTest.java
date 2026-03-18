package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't
        //exist
        assertTrue(list.hasCity(calgary));
    }

//    @Test void countCity(){
//        CustomList list = new CustomList();
//        City calgary = new City("Calgary", "AB");
//        City lahore= new City("Lahore", "PJ");
//        list.addCity(calgary);
//        list.addCity(lahore);
//        int l= list.countCities();
//
//        assertEquals(2,l);
//    }

//    @Test void deleteCity(){
//        CustomList list = new CustomList();
//        City city = new City("Edmonton", "AB");
//        list.addCity(city);
//
//        assertEquals(1, list.countCities());
//
//        list.deleteCity(city);
//
//        assertEquals(0, list.countCities());
//
//    }



}
