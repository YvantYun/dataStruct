package com.kino.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-20
 */

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        //Thread t1 = new Thread(new T());
        //Thread t2 = new Thread(new T());
        //
        //t1.start();
        //t2.start();
        //System.out.println("program end");

        //HungrySingleton instance = HungrySingleton.getInstance();
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        //oos.writeObject(instance);
        //File file = new File("singleton_file");
        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        //
        //HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);



    }
}
