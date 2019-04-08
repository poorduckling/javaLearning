package com.xiaojukeji;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

    //这里以改类全路径名称为日志器的名字，在log4j2.xml中，可以指定该日志器的日志输出
    static Logger logger = LogManager.getLogger(MavenProfileTest.class.getName()); //
    public static String getMysqlUser(){
      String  mysqlUser =  PropertyUtils.getPropertyValue(MYSQL_JDBC_USER).toString();
        logger.info("你使用的MySQLuser是：{},你使用的Logger是：{}",mysqlUser,logger.getName());
        return mysqlUser;
    }

    public static String getMysqlDriver(){
        String  mysqlDriver =  PropertyUtils.getBasePropertyValue(MYSQL_JDBC_DRIVER).toString();
        logger.info("你使用的MySQDriver是：{},你使用的Logger是：{}",mysqlDriver,logger.getName());
        return mysqlDriver;
    }
}
