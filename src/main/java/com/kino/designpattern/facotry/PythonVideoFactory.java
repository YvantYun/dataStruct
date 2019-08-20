package com.kino.designpattern.facotry;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-07-24
 */

public class PythonVideoFactory extends VideoFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
