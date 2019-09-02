package com.kino.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-20
 */

public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    /**
     * 多线程是不安全的
     *
     * 在static 加synchronized 相当于锁这个类 class文件
     * 不是的话 锁这个堆内存生成的对象
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if(lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if(lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    // 1. 分配内存
                    // 2. 初始化对象
                    // 3. 设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //  实际上可能 2 3的顺序会被颠倒 也就是重排序
                }
            }

        }

        return lazyDoubleCheckSingleton;
    }
}
