package obiectConstructor;

import org.testng.annotations.Test;

public class avionTest {

    @Test
    public void testMethod(){
        Avion avion1 = new Avion("Militar", "Tiger", 2, 2015, "Fighter");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("Comercial", "Boeing", 300, 2017, 300, "747");
        avion2.prezentareAvion();
    }

}
