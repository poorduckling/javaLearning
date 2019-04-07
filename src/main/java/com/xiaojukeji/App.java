package com.xiaojukeji;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App
{
    static Logger logger = LogManager.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String mysqlUser =  MavenProfileTest.getMysqlUser();
        String mysqlDriver = MavenProfileTest.getMysqlDriver();
        logger.info("你使用的MySQDriver是：{},你使用的MySQLuser是：{}",mysqlDriver,mysqlUser);
    }
}
