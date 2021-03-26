package Ejercicio3;

import java.util.ArrayList;

public class Carrera {
    private int distancia;
    private int premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public void darDeAltaAuto(int velocidad,int aceleracion,int anguloDeGiro,String patente){
        Auto auto = new Auto(velocidad,aceleracion,anguloDeGiro,patente);
        vehiculos.add(auto);
    }

    public void darDeAltaMoto(int velocidad,int aceleracion,int anguloDeGiro,String patente){
        Moto moto = new Moto(velocidad,aceleracion,anguloDeGiro,patente);
        vehiculos.add(moto);
        vehiculos.get(0).getPatente().equals(patente);
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        for(int i =0;i<vehiculos.size();i++){
           if(vehiculos.get(i).getPatente().equals(unaPatente)){
               vehiculos.remove(i);
           };
        }
    }

    public void eliminarVehiculo(Vehiculo vehículo){
        this.vehiculos.remove(vehículo);
    }

    public void ganador(){
        int aux=0,ganador;
        for (Vehiculo v: vehiculos) {
          ganador =   v.getVelocidad() *  v.getAceleracion() / (v.getAnguloDeGiro()*(v.getPeso() - v.getRuedas() * 100));
            System.out.println("ganador = " + ganador);
          if(ganador > aux){aux = ganador;}
        }
        System.out.println("Ganador de la carrera = " + aux);
    }

    public void socorrerAuto(String patente){
        for(int i =0;i<vehiculos.size();i++){
            if(vehiculos.get(i).getPatente().equals(patente)){
                SocorristaAuto sa = new SocorristaAuto();
                sa.socorrer((Auto)vehiculos.get(i));
            };
        }
    }

    public void socorrerMoto(String patente){
        for(int i =0;i<vehiculos.size();i++){
            if(vehiculos.get(i).getPatente().equals(patente)){
                SocorristaMoto sa = new SocorristaMoto();
                sa.socorrer((Moto)vehiculos.get(i));
            };
        }
    }

}
