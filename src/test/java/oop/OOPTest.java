package oop;

import org.testng.annotations.Test;

public class OOPTest {
    @Test
    public void testMethod() {

        Student Laura = new Student("Popescu", "Laura", 20, "Psihologie", true, "Statistica");
        Laura.mergeLaCursuri();
        Laura.mergeLaPetreceri();
        //Laura.infoStudent();
        //Laura.mananca();

        Angajat Eduard = new Angajat("Ionescu", "Eduard", 22, "Arka", "inginer", 1);
        Eduard.isiDaDemisia();
        Eduard.primesteSalariu();
        //Eduard.infoAngajat();
        //Eduard.mananca();

        //Eduard.programLucru();
        // Eduard.programLucru(4);
        //Eduard.programLucru("remote");
        // Eduard.programLucru(false);

        StudentAngajat Marius = new StudentAngajat("Popescu", "Marius", 20, "Facultatea de Sport", false, "fizioterapie", "McDonalds", "somer", 1);
        Marius.mergeLaPetreceri();
        Marius.primesteSalariu();


    }
}
