package obiectConstructor;

public class Avion {

    //un constructor are rolul de a initializa variabilele unei clase
    //il recunoastem dupa numele clasei - este o metoda speciala care nu are void sau return
    //putem sa avem unul sau mai multi constructuri intr-o clasa care se difer dupa nr sau tipul de parametri
    //intr-o clasa exista tot timpul un constructor default (fara parametri)
    //sunt cu si fara parametri
    //trebuie sa fie intotdeauna public

    //un obiect in Java este o instanta a unei clase
    //folosim cuvantul new pentru initializare
    //cand se initializeaza un obiect se apeleaza constructorul clasei

    public String tip;
    public String marca;
    public int capacitatePasageri;
    public int anFabricatie;
    public Integer numarBagaje;
    public String modelAvion;

    public Avion(String tip, String marca, int capacitatePasageri, int anFabricatie, Integer numarBagaje, String modelAvion){
        this.tip = tip;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
        this.numarBagaje = numarBagaje;
        this.modelAvion = modelAvion;
    }

    public void prezentareAvion(){
        System.out.println("Tipul avionului este: " +tip);
        System.out.println ("Marca avionului este: " +marca);
        System.out.println ("capacitea maxima de pasageri este: " +capacitatePasageri);
        System.out.println ("Anul fabricatiei este: " +anFabricatie);
        System.out.println ("Numarul de bagaje este: " +numarBagaje);
        System.out.println ("Modelul avionului este: " +modelAvion);
        if (numarBagaje != null){
            System.out.println("Numarul de bagaje este: " + numarBagaje);
        }else{
            System.out.println("Avionul nu are bagaje");
        }
    }

    public Avion(String tip, String marca, int capacitatePasageri, int anFabricatie, String modelAvion){
        this.tip = tip;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
        this.modelAvion = modelAvion;
    }
}
