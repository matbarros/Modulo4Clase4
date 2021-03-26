package Ejercicio1;

public class Timer {

    private static long start;
    private static long stop;

    public static void start(){
        start = System.currentTimeMillis();
    }

    public static void stop(){
        stop = System.currentTimeMillis();
    }

    public static long elapsedTime(){
        long res = stop - start;
        return res;
    }
}
