package Ejercicio1;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter<BubbleSortSorterImple>{


    public <T> void sort(T[] arr, Comparator<T> c) {

        Timer t = new Timer();
        t.start();
        boolean fin = false;
        while(!fin){
            fin = true;
            for(int i=0;i < arr.length-1;i++){
                if(c.compare(arr[i],arr[i+1])>0){
                    T aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    fin = false;
                }

            }
        }
        t.stop();
    }
}
