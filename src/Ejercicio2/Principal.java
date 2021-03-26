package Ejercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        GuardaRopa g = new GuardaRopa();

        Prenda p1 = new Prenda();
        Prenda p2 = new Prenda();
        p1.setMarca("m1");
        p1.setModelo("m1");
        p2.setMarca("m2");
        p2.setModelo("m2");

        ArrayList<Prenda> prendas = new ArrayList<Prenda>();
        prendas.add(p1);
        prendas.add(p2);


        g.guardarPrendas(prendas);

        Prenda p3 = new Prenda();
        Prenda p4 = new Prenda();

        p3.setModelo("m3");
        p3.setMarca("m3");
        p4.setModelo("m4");
        p4.setMarca("m4");


        ArrayList<Prenda> prendas2 = new ArrayList<Prenda>();
        prendas2.add(p3);
        prendas2.add(p4);

        g.guardarPrendas(prendas2);

        g.mostrarPrendas();

        g.devolverPrendas(0);

        g.mostrarPrendas();

    }
}
