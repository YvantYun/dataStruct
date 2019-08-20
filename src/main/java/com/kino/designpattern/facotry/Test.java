package com.kino.designpattern.facotry;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-07-24
 */

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory1 = new PythonVideoFactory();
        VideoFactory videoFactory2 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

    }
}
