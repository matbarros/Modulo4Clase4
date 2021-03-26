package Ejercicio3;

public class Auto extends Vehiculo{

    private static int ruedas = 4;
    private static int peso = 1000;

    Auto(int velocidad,int aceleracion,int anguloDeGiro,String patente ){
        super(velocidad,aceleracion,anguloDeGiro,patente,peso,ruedas);

    }
}
