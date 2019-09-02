package com.kino.adapter.objectadapter;

import com.kino.adapter.objectadapter.Adapter;
import com.kino.adapter.objectadapter.ConcreteTarget;
import com.kino.adapter.objectadapter.Target;

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

        Target adapteeAdapter = new Adapter();
        adapteeAdapter.request();


    }
}
