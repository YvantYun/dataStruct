package com.kino.designpattern.facotry;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-15
 */

public class FEVideoFactory  extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
