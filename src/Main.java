import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //losuj 10 liczb do tablicy
        int[] tablicaWylosowanychLiczb = losujliczbydotablicy(5);
        //wypisz elementy tablicy

        wypisz(tablicaWylosowanychLiczb);
        System.out.println();

        //losuj 30 liczb z zakresu 1,4- bez powtorzen
ArrayList
    HashSet<Integer> wylosowaneLiczbyZbior = wylosujLiczbyBezPowtorzenDoListy()

    }
    private static  HashSet<Integer>WylosujLiczybBezPowtorzenDoZbioru(int ileLiczb) {
        HashSet<Integer> LiczbyWylosowane = new HashSet<>();
        //elementy w zbiorze sie nie powtarzają
        //elementy są nie indexowane, nieuporządkowane
        Random random = new Random();
        for (int i = 0; i < ileLiczb; i++) {
    int liczba = random.nextInt(20);
    LiczbyWylosowane.add(liczba);
        }
        return LiczbyWylosowane;
    }

    private  static ArrayList<Integer> wylosujLiczbyBezPowtorzenDoListy(int ileLiczb){
        ArrayList<Integer> LiczbyWylosowane = new ArrayList<>();
        //nie musi byc znany rozmiar listy
        //moze byc zmieniony w trakcie dzialania programu
        //w kazdej kolekcji tylko typy zlozone
        //typ zlozony pisany wielką literą
        Random random = new Random();
        for (int i = 0; i < ileLiczb; i++ ){
            int liczba = random.nextInt(40)+1;
            while  (LiczbyWylosowane.contains(liczba)){
                liczba = random.nextInt(40)+1;
            }
            LiczbyWylosowane.add(liczba);
        }
        return LiczbyWylosowane;
    }
        private static void wypisz(int[] tablica){
        System.out.println("Wylosowana tablica:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ",");
        }
    }
    private static void wypisz(HashSet<Integer> zbior){
        System.out.println("Wypisane liczby ze zbioru");
        for (int liczba:zbior){
            System.out.print(liczba+",");
        }
        System.out.println();
    }
    private static  void wypisz (ArrayList<Integer> Lista){
        System.out.println("Wypisywana lista");
        for (int i = 0; i < Lista.size(); i++) {
            System.out.print(Lista.get(i)+",");
        }
        System.out.println();
    }

    private static int[] losujliczbydotablicy(int ileLiczb){
        int[] liczbyWylosowane = new int[ileLiczb];
        Random random = new Random();
        for (int i = 0; i < liczbyWylosowane.length; i++) {
            liczbyWylosowane[i] = random.nextInt(100)+1;


        }
        return liczbyWylosowane;
    }
}
