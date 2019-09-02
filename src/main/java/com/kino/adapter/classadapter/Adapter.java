package com.kino.adapter.classadapter;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-31
 */

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
