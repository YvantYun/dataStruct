package com.kino.designpattern.abstractfactory;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-15
 */

public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
