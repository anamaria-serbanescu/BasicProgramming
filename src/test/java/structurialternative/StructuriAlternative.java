package structurialternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative = conditii
    //IF este o structura de control care este folosita pentru a evalua o conditie boolean si pentru a executa
    // bloc de cod daca aceasta conditie este adevarata
    // if (conditia) {
    // blocul de cod care se executa daca conditia este adevarata
    // } else {
    // blocul de cod care se executa daca conditia este falsa
    // }


    @Test
    public void MetodeDeTest() {
//        VerificareNumar(4);
//        VerificareNumar(-1);
//        VerificareNumar(0);
//        VerificareNumar(9);
//        VerificareNumar(-12);
        afisareZileSaptamana(8);
    }

    public void VerificareNumar(int numar) {
        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("numarul: " + numar + " este par pozitiv");
            } else {
                System.out.println("numarul: " + numar + " este impar pozitiv");
            }
        } else if (numar < 0) {
            if (numar % 2 == 0) {
                System.out.println("numarul: " + numar + "este par negativ");
            } else {
                System.out.println("numarul: " + numar + "este impar negativ");
            }
        } else {
            System.out.println("numarul: " + numar + "este egal cu 0");
        }
    }
    // Switch este o structura de control care permite evaluarea si executarea uneia dintre mai multe blocuri de cod
    // in functie de valoarea expresiei evaluare
    // switch (expresia de evaluat){
    //      case valoare 1:
    //            blocul de cod care se executa in cazul in care expresia are valoarea 1
    //            break;
    //      case valoare 2:
    //           blocul de cod care se executa in cazul in care expresia are valoarea 2
    //           break;
    //      default: alte valori
    //           blocul de cod care se executa in cazul in care niciunul din cazurile de mai sus nu se potriveste
    //           break;

    public void afisareZileSaptamana (int zi) {
        switch (zi) {
            case 1:
                System.out.println("Astazi este ziua de luni");
                break;
            case 2:
                System.out.println("Astazi este ziua de marti");
                break;
            case 3:
                System.out.println("Astazi este ziua de miercuri");
                break;
            case 4:
                System.out.println("Astazi este ziua de joi");
                break;
            case 5:
                System.out.println("Astazi este ziua de vineri");
                break;
            case 6:
                System.out.println("Astazi este ziua de sambata");
                break;
            case 7:
                System.out.println("Astazi este ziua de duminica");
                break;
            default:
            System.out.println("Nu este o zi a saptamanii");
        }
    }











}
