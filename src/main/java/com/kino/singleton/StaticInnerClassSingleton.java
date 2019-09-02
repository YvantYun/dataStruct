package com.kino.singleton;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-20
 */

public class StaticInnerClassSingleton {



    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();

        public static StaticInnerClassSingleton getInstance() {
            return InnerClass.staticInnerClassSingleton;
        }
    }
}
