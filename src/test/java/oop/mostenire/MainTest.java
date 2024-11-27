package oop.mostenire;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest extends BaseTest{

    @BeforeClass
    public void init(){
        System.out.println("Initializare main test");
    }

    @Test
    public void mainTest(){
        //BaseTest BaseTest = new BaseTest();
        baseTest();
        System.out.println("Executare main test");
    }

}
