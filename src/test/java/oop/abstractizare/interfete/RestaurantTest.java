package oop.abstractizare.interfete;

import org.testng.annotations.Test;

public class RestaurantTest {

    @Test
    public void activitatiRestaurant() {
        Bucatar Marius = new Bucatar();
        Marius.pregatesteMancare("sarmale");

        Chelner Ionut = new Chelner();
        Ionut.servesteMancarea(3, "sarmale");
        Ionut.curataMasa(7);
    }
}
