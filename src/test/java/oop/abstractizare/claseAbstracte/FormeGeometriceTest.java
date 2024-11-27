package oop.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class FormeGeometriceTest {

    @Test
    public void testFormeGeometrice() {
        Patrat patrat = new Patrat();
        patrat.infoFormeGeometrice();
        patrat.deseneaza();

        Triunghi triunghi = new Triunghi();
        triunghi.infoFormeGeometrice();
        triunghi.deseneaza();

        //clasa abstracta nu se poate instantia
        //FormeGeometrice fg = new FormeGeometrice()

    }
}
