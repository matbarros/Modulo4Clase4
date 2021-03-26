package Ejercicio1;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MiFactory {


    /*public static Object getInstance(String objName) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Properties p = new Properties();
        p.load(new FileInputStream("MiFactory.properties"));

        String className = (String)p.get(objName);

        return Class.forName(className).newInstance();
    }*/

    public static Object getInstance(String objName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        Properties prop = new Properties();
        try {
            prop.load(MiFactory.class.getResourceAsStream("/Ejercicio1/MiFactory.properties"));//here your src folder
            System.out.println(prop.getProperty("sorter"));

            return Class.forName(prop.getProperty(objName));

        } catch(IOException e) {}
        return Class.forName("className").newInstance();
    }
}
