import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private ArrayList<Integer> wylosowane = new ArrayList<>();
    private ArrayList<Integer> wpisane = new ArrayList<>();
    private LinkedList<Integer> trafione = new LinkedList<>();

    private void wylosujLiczby(int ile) {
        for (int i = 0; i < ile; i++) {
            int liczba1 = (int) (Math.random() * 10 + 1);
            while (wylosowane.contains(liczba1)) {
                liczba1 = (int) (Math.random() * 10 + 1);
            }
            wylosowane.add(liczba1);
        }
    }

    private void wpiszZKlawiatury(int ile) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj " + ile + " liczb: ");

        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba);
        }
    }
    private void wypiszKolekcje(List<Integer> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + ", ");
        }
    }
    private void sprawdz(){
        for (Integer wpisana : wpisane) {
            if (wylosowane.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
    }
    public void zagraj(){
        wylosujLiczby(6);
        wpiszZKlawiatury(6);
        sprawdz();
        System.out.print("Wylosowane: ");
        wypiszKolekcje(wylosowane);
        System.out.print("Wpisane: ");
        wypiszKolekcje(wpisane);
        System.out.print("Trafione: ");
        wypiszKolekcje(trafione);
    }
}
