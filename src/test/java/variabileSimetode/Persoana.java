package variabileSimetode;

import org.testng.annotations.Test;

public class Persoana {

  //o clasa in Java este o structura care defineste atat atributele/ variabilele (definesc caracteristici)
    // si metodele unui obiect (comportamentele)
    // tipuri de date in Java:
    // 1. primitive: stocheaza direct valorile in variabila - 8 tipuri de date
    // 1.1 int - numere intregi 32 bit
    // 1.2 double - numere cu zecimale
    // 1.3 char - caractere individuale ex: A
    // 1.4 boolean - true sau false
    // 1.5 byte - numere intregi 8 biti
    // 1.6 short - numere intregi 16 biti
    // 1.7 long - numere intregi 64 biti
    // 1.8 float - numere cu zecimale dar precizia mai mica decat la double

    // 2. de referinta - stocheaza doar referinta catre un obiect
    // 2.1 string - sir de caractere
    // 2.2 Integer - o clasa care invaluieste / wrapper

    // variabile globale / de instanta
String nume="Popescu"; //variabila globala de tip string
    String prenume="Ionut"; //variabila globala de tip string
    char sex='M'; //variabila globala de tip char
    int anulNasterii=2000; // variabila globala de tip int

    @Test // asta e metoda de test
    public void afisarePersoana(){
        System.out.println("numele persoanei este: "+nume);
        System.out.println("prenume persoanei este: "+prenume);
        System.out.println("anul persoanei este: "+anulNasterii + " sexul este: "+sex);

    }

    @Test
    public void afisareDetaliiPersoana(){
        double inaltime=1.80;
        int greutate=80;
        System.out.println("persoana are inaltime de: "+inaltime);
        System.out.println("persoana are greutate de: "+greutate);
        System.out.println("numele persoanei este: "+nume + " persoana are inaltime de: "+inaltime);
    }

    // o metoda este un bloc de cod care indeplineste o functie specifica
    // metodele sunt de doua tipuri
    //void - nu returneaza nimic
    //return - returneaza un tip de date: string, int, boulean
    // in loc de publoc void va fi public int
    // la final inainte de ultima acolada, trebuie sa fie un return de aceeasi valoare (ex. string sau int)

    public int calculVarsta (){
        return 2018-anulNasterii;
    }
    public boolean esteAdult (int varsta){
        return varsta>18;
        }

        @Test
        public void afisareDatePersoana (){
        int varstareala=calculVarsta();
            System.out.println("varsta calculata a persoanei este: "+calculVarsta()+" ani");
            System.out.println("persoana este adult?" +esteAdult(varstareala));
            esteAdult(varstareala);
        }


}

