package com.kino.designpattern.abstractfactory;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-15
 */

public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python手记");
    }
}
