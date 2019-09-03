package com.kino.flyweight;

/**
 * <p>
 *
 * </p>
 *
 * @author yunfeng
 * @since 2019-09-02
 */

public class Test {
    private static final  String[] departments = {"研发","运营", "产品","PM"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int)Math.random()];
            Manager manager = (Manager) ManagerFactory.getManage(department);

            manager.report();

        }
    }
}
