package oop;

public class Angajat extends Persoana implements AngajatInterface {

    private String companie;
    private String profesie;
    private int vechime;

    public Angajat(String nume, String prenume, int varsta, String companie, String profesie, int vechime) {
        super(nume, prenume, varsta);
        this.companie = companie;
        this.profesie = profesie;
        this.vechime = vechime;
    }

    public void infoAngajat(){
        infoPersoana();
        System.out.println("Persoana: " +getNume() + " este angajat la compania: " +companie);
        System.out.println("Persoana: " +getPrenume() + " are profesie de: " +profesie);
        System.out.println("Persoana: " +getNume() + " are o vechime de: " +vechime);
    }

    //Polimorfism dinamic EXEMPLU
    public void mananca(){
        System.out.println("Angajatul mananca in pauza de masa");
        super.mananca();
    }

    public void programLucru(){
        System.out.println("Angajatul lucreaza 8 ore standard");
    }

    public void programLucru(int numarOre){
        System.out.println("Angajatul part-time lucreaza " +numarOre + " ore");
    }

    public void programLucru(String locatie){
        System.out.println("Testerul lucreaza " +locatie);
    }

    public void programLucru(boolean lucreazaInWeekend){
        System.out.println("Angajatul disperat lucreaza/nu lucreaza in weekend " +lucreazaInWeekend);
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public String getProfesie() {
        return profesie;
    }

    public void setProfesie(String profesie) {
        this.profesie = profesie;
    }

    public int getVechime() {
        return vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la lucru");

    }

    @Override
    public void munceste() {
        System.out.println("Angajatul se preface ca munceste");

    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariul lunar");

    }

    @Override
    public void isiDaDemisia() {
        System.out.println("Angajatul isi da demisia");

    }
}
