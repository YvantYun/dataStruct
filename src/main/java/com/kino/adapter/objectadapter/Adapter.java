package com.kino.adapter.objectadapter;


/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-31
 */

public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
