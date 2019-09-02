package com.kino.adapter.classadapter;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-31
 */

public class Test {
    public static void main(String[] args) {

        Target target = new ConcreteTarget();
        target.request();

        // adapter
        Target adapterTarget = new Adapter();
        adapterTarget.request();


    }
}
