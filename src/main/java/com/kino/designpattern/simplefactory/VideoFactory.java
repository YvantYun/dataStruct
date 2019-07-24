package com.kino.designpattern.simplefactory;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-07-24
 */

public class VideoFactory {

    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }else {
            return null;
        }
    }
}
