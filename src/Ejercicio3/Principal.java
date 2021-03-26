package Ejercicio3;

public class Principal {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        carrera.darDeAltaAuto(1000,100,10,"A");
        carrera.darDeAltaAuto(900,100,10,"B");
        carrera.darDeAltaMoto(500,100,10,"C");
        carrera.darDeAltaMoto(400,100,10,"D");

        carrera.ganador();

        carrera.socorrerAuto("A");
        carrera.socorrerMoto("D");

    }
}
