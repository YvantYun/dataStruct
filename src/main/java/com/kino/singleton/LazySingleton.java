package com.kino.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-20
 */

public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    /**
     * 多线程是不安全的
     *
     * 在static 加synchronized 相当于锁这个类 class文件
     * 不是的话 锁这个堆内存生成的对象
     *
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        //synchronized(LazySingleton.class){
        //    if(lazySingleton == null) {
        //        lazySingleton = new LazySingleton();
        //    }
        //}
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }
}
