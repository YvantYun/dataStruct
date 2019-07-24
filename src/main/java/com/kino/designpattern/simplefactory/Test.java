package com.kino.designpattern.simplefactory;

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
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");

        if(video == null) {
            return;
        }
        video.produce();

    }
}
