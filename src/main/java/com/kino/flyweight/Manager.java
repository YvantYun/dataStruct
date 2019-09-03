package com.kino.flyweight;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-09-02
 */

public class Manager implements Employee{
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String department;

    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
