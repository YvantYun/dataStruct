package com.kino.designpattern.abstractfactory;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-15
 */

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python 视频");
    }
}
