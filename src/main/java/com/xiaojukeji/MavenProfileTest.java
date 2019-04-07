package com.xiaojukeji;

import static com.xiaojukeji.PropertyUtils.MYSQL_JDBC_DRIVER;
import static com.xiaojukeji.PropertyUtils.MYSQL_JDBC_USER;

/**
 * @ClassName MavenProfileTest
 * @Description TODO
 * @Author didi
 * @Date 2019/4/79:19 PM
 * @Version 1.0
 */
public class MavenProfileTest {
    public static String getMysqlUser(){
        return PropertyUtils.getPropertyValue(MYSQL_JDBC_USER).toString();
    }

    public static String getMysqlDriver(){
        return PropertyUtils.getBasePropertyValue(MYSQL_JDBC_DRIVER).toString();
    }
}
