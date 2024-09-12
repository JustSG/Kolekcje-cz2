import java.util.*;

public class Main {

    /**
     * wylosujListe - losuje liste liczb całkowitych z zakresu 1 do 100
     *
     * @param ileElementow - losowana liczba elementów
     * @return - ArrayList z liczbami wylosowanym
     */
    private static ArrayList<Integer> wylosujListe(int ileElementow) {
        ArrayList<Integer> listaLiczbWylosowanychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba1 = (int) (Math.random() * 100 + 1);
            while (listaLiczbWylosowanychBezPowtorzen.contains(liczba1)) {
                liczba1 = (int) (Math.random() * 100 + 1);
            }
            listaLiczbWylosowanychBezPowtorzen.add(liczba1);
        }
        return listaLiczbWylosowanychBezPowtorzen;
    }

    private static void wypiszListe(List<Integer> listaDoWypisywania) {
        System.out.println("Wypisana lista: ");
        for (int i = 0; i < listaDoWypisywania.size(); i++) {
            System.out.println(listaDoWypisywania.get(i));
        }
    }

    private static ArrayList<Integer> wstawLiczbyDoListy(int ileElementow) {
        ArrayList<Integer> listaLiczbZKlawiatury = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj " + ileElementow + " liczb: ");
        for (int i = 0; i < ileElementow; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(liczba);
        }
        return listaLiczbZKlawiatury;
    }

    private static LinkedList<Integer> zwrocElementyZObuList(ArrayList<Integer> listaLiczbZKlawiatury, ArrayList<Integer> listaLiczbWylosowanychBezPowtorzen) {
        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wpisana : listaLiczbZKlawiatury) {
            if (listaLiczbWylosowanychBezPowtorzen.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
        return trafione;
    }

    public static void main(String[] args) {
        ArrayList<Integer> losowe = wylosujListe(6);
        wypiszListe(losowe);
        ArrayList<Integer> wpisane = wstawLiczbyDoListy(6);
        wypiszListe(wpisane);
        LinkedList<Integer> trafione = zwrocElementyZObuList(losowe, wpisane);
        wypiszListe(trafione);
    }

}