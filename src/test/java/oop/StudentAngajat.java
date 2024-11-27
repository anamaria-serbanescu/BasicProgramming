package oop;

public class StudentAngajat extends Persoana implements StudentInterface, AngajatInterface{

    private String facultate;
    private boolean bursa;
    private String cursuri;

    private String companie;
    private String profesie;
    private int vechime;

    public StudentAngajat(String nume, String prenume, int varsta, String facultate, boolean bursa, String cursuri, String companie, String profesie, int vechime) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.bursa = bursa;
        this.cursuri = cursuri;
        this.companie = companie;
        this.profesie = profesie;
        this.vechime = vechime;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Studentul merge la munca dupa cursuri");

    }

    @Override
    public void munceste() {
        System.out.println("El munceste doar 4 ore");

    }

    @Override
    public void primesteSalariu() {
        System.out.println("La fiecare 2 sapt este platit");

    }

    @Override
    public void isiDaDemisia() {
        System.out.println("Isi da demisia cand face suficienti bani");

    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Mai merge la cursuri de plictiseala");

    }

    @Override
    public void sustineExamen() {
        System.out.println("Sustine examene pentru care nu a invatat");

    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("Nu are bani, dar nici timp de petreceri");

    }
}
