package oop.polimorfism.polimorfismStatic;

import org.testng.annotations.Test;

public class CalculeTest {

    @Test
    public void testAdunare() {
        Calcule calcule = new Calcule();
        System.out.println("Adunarea a doua int uri este: " +calcule.adunare(2,3));
        System.out.println("Adunarea a doua double uri este: " +calcule.adunare(2.5,3.5));
        System.out.println("Adunarea a doua string uri este: " +calcule.adunare("buna", " seara"));
    }
}
