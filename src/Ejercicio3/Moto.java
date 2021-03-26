package Ejercicio3;

public class Moto extends Vehiculo{

    private static int ruedas = 2;
    private static int peso = 300;

    Moto(int v, int a, int an, String pa) {
        super(v, a, an, pa, peso, ruedas);
    }
}
