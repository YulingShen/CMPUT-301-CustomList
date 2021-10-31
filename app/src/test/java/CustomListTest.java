import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CustomListTest {

    static CustomList list;

    @BeforeEach
    public void setup(){
      list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hasCityTest(){
        City newcity = new City("Halifax", "NS");
        list.addCity(newcity);
        assertTrue(list.hasCity(newcity));
    }

    @Test
    public void deleteCityTest(){
        City newcity = new City("Halifax", "NS");
        list.addCity(newcity);
        int listSize = list.getCount();
        list.deleteCity(newcity);
        assertEquals(list.getCount(),listSize-1);

    }
}
