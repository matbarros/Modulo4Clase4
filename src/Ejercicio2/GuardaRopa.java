package Ejercicio2;

import java.util.*;

public class GuardaRopa extends Prenda{

    private int contador = 0;
    private HashMap<Integer, ArrayList<Prenda>> mapa = new HashMap<Integer,ArrayList<Prenda>>();

    public Integer guardarPrendas(ArrayList<Prenda> listaDePrenda){
        mapa.put(contador,listaDePrenda);
        contador++;
        return contador;
    }

    public void mostrarPrendas() {

        for(Map.Entry<Integer,ArrayList<Prenda>> entry : mapa.entrySet()){
            int key = entry.getKey();
            ArrayList<Prenda> prendas = entry.getValue();
            System.out.println("Guarda ropa: " + key + " Prenda: " + Arrays.toString(prendas.toArray()));
        }
    }

    public ArrayList<Prenda> devolverPrendas(Integer numero){
        ArrayList<Prenda> aux = mapa.get(numero);
        mapa.remove(numero);
        return aux;
    }
}


