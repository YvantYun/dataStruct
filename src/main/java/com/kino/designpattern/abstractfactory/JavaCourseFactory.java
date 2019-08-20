package com.kino.designpattern.abstractfactory;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-15
 */

public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
