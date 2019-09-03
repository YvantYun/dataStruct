package com.kino.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-09-02
 */

public class ManagerFactory  {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManage(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);


        if (manager == null) {
            manager = new Manager(department);
            System.out.println("创建部门经理：" + department);
            String reportContent = department + "部门汇报： 此次报考内容、、、、";
            manager.setReportContent(reportContent);
            System.out.println("创建报告：" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;

    }
}
