import interfejs.Figura;
import interfejs.Prostokat;
import interfejs.Kolo;
import interfejs.Trojkat;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Figura> figury = new ArrayList<>();
        //kolo
        System.out.println("Podaj promien: ");
        figury.add(new Kolo(scanner.nextDouble()));
        //trojkat
        System.out.println("Podaj dlugosc boku a: ");
        System.out.println("podaj dlugosc boku b: ");
        figury.add(new Trojkat(scanner.nextDouble(),scanner.nextDouble()));
        //prostokat
        System.out.println("Podaj dlugosc boku a: ");
        System.out.println("podaj dlugosc boku b: ");
        figury.add(new Prostokat(scanner.nextDouble(),scanner.nextDouble()));

        for(Figura jd : figury){
            System.out.println(jd.getClass().getSimpleName());
            System.out.println("pole: " + jd.obw());
            System.out.println("obwod: " + jd.powie());
        }
    }
}