package com.kino.designpattern.facotry;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-07-24
 */

public abstract class VideoFactory {

    public abstract Video getVideo();

    //public Video getVideo(String type) {
    //    if ("java".equalsIgnoreCase(type)) {
    //        return new JavaVideoFactory();
    //    } else if ("python".equalsIgnoreCase(type)) {
    //        return new PythonVideo();
    //    }else {
    //        return null;
    //    }
    //}
}
