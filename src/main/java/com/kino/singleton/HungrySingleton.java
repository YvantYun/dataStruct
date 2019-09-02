package com.kino.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-20
 */

public class HungrySingleton {

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }
    private HungrySingleton() {
        if(hungrySingleton == null) {
            throw new IllegalArgumentException("禁止反射调用");
        }
    }


    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
