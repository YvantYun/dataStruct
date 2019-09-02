package com.kino.adapter.objectadapter;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-31
 */

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget的方法");
    }
}
