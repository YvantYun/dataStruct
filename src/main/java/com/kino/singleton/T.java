package com.kino.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-20
 */

public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
    }
}
