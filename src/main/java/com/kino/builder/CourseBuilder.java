package com.kino.builder;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-19
 */

public abstract class CourseBuilder {

    //private String courseName;
    //
    //private String coursePPT;
    //
    //private String courseVideo;
    //
    //private String courseArticle;
    //
    //private String courseQA;

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
