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
}
