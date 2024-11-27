package oop.abstractizare.interfete;

public class Chelner implements Serveste, Curata{
    @Override
    public void curataMasa(int numarMasa) {
        System.out.println("Chelnerul curata masa cu numarul: " +numarMasa);
    }

    @Override
    public void servesteMancarea(int numarComanda, String tipulMancarii) {
        System.out.println("La comanda cu numarul " +numarComanda +" mancarea este " +tipulMancarii);

    }
}
