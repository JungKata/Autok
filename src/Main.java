import hu.petrik.Autok.Autok;
import hu.petrik.Autok.Porsche;
import hu.petrik.Autok.Tesla;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Autok> autok = new ArrayList<>();

    public static void main(String[] args) {
        Porsche p1 = new Porsche(180);
        Tesla t1 = new Tesla();

        autok.add(p1);
        autok.add(t1);

        System.out.println("Porsche:");
        System.out.println(p1.toString());
        System.out.println();
        System.out.println("Tesla:");
        System.out.println(t1.toString());
    }
}