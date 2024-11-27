package oop;

public class Persoana {

    //OOP = programare orientata obiect (object-oriented programming)
    // 4 principii importante: mosternire, incapsulare, polimorfism si abstractizare
    // Mosternire - in Java este conceptul prin care o clasa (clasa-copil) mosteneste o alta clasa (clasa-parinte)
    //se poate mosteni o singura clasa
    //in momentul in care o clasa mosteneste alta clasa, clasa-copil va trb sa apeleze constructorul din parinte
    //in momentul in care se aplica mostenirea, clasa-copil are vizibilitate asupra variabilelor/ metodelor din clasa-parinte
    //constructorul din clasa-parinte spre copil se apeleaza cu "super"
    //in Java ca sa extinzi o alta clasa se foloseste "extends"

    //Incapsulare - procesul prin care tinem private anumite informatii in asa fel incat acestea sa nu poata fi modificate
    //facem variabilele/metodele  din public in privat
    //private = acces control care restrictioneaza accesul doar in clasa respectiva
    //ca sa putem extrage/ modifica  o valoare a unei variabile private ne folosim de metode "get" si "set"

    //Polimorfism - conceptul prin care definim mai multe implementari pentru o metoda
    //este de doua tipuri:overloading (static) si overriding (dinamic)
    //polimorfism dinamic - se foloseste in special la mosternire si se pot suprascrie
    //intr-o ierarhie de clase obtinute prin mosternire, o metoda poate avea implementari diferite
    //daca vrem sa chemam in copil metoda din parinte trebuie sa folosim "super"
    //polimorfism static = posibilitatea prin care o metoda are mai multe implementari prin
    //diferentierea tipului sau nr de parametri

    //Abstractizarea presupune expunerea doar a aspectelor esentiale ale unui obiect, ascunzand detaliile implementarii
    //se realizeaza prin folosirea claselor abstracte sau a interfetelor
    //se reduce complet implememtarea ramanand doar numele metodelor, parametri sau tipul returnat
    //clase abstracte - utilizate pentru a declara caract comune ale unei subclase
    //o clasa abstracta poate fi utilizata doar ca super-clasa pentru alte clase care extind clasa abstracta
    //poate avea metode abstracte (fara implememtare) si metode concrete (cu implementare)
    //declaratia unei clase abstracte se face cu cuvantul cheie "abstract"
    //o clasa abstracta nu poate fi instantiata
    //interfata e un protocol pe care clasele trebuie sa il implementeze (ofera raspuns la lipsa mostenirii multiple)
    //o clasa poate mosteni mai multe interfete
    //intr-o interfata avem o colectie de metode abstracte si constante
    //interfata contine doar metode abstracte


    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana (){
        System.out.println("Numele persoanei este: " +nume);
        System.out.println("Prenumele persoanei este: " +prenume);
        System.out.println("Varsta persoanei este: " +varsta);
    }

    //Polimorfism dinamic EXEMPLU prima implementare a metodei
    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
