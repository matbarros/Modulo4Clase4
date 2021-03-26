package Ejercicio1;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException, NoSuchMethodException, InvocationTargetException {


        Sorter sorter = (Sorter) MiFactory.getInstance("sorter");

        Integer[] arr = new Integer[10000];
        int max = 10000;
        for(int i =0;i<10000;i++){
            arr[i] = max;
            max--;
        }

        //BubbleSortSorterImple bb = new BubbleSortSorterImple();
        //QuickSortSorterImple qq = new QuickSortSorterImple();
        //HeapSortSorterImple hh = new HeapSortSorterImple();

        Comparator<Integer> c = (a,b) -> a.compareTo(b);

        sorter.sort(arr,c);
        //bb.sort(arr,c);
        //qq.sort(arr,c);
        //hh.sort(arr,c);

        for(int i=0;i<arr.length;i++){
            System.out.println("arr = " + arr[i]);
        }
        System.out.println("tiempo transcurrido = " + Timer.elapsedTime());
    }
}
