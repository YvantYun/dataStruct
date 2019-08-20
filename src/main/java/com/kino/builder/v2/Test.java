package com.kino.builder.v2;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-08-19
 */

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java").buildCoursePPT("javaPPT").build();
        System.out.println(course);
    }
}
