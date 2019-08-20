package com.kino.designpattern.facotry;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-15
 */

public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端视频");
    }
}
