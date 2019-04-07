package com.xiaojukeji;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @ClassName PropertyUtils
 * @Description TODO
 * @Author didi
 * @Date 2019/4/79:14 PM
 * @Version 1.0
 */
public class PropertyUtils {

    private static Properties properties = null;
    private static Properties baseProperties = null;
    public static final String COMMON_FILE = "application.properties";
    public static final String BASE_FILE = "base.properties";
    private static byte[] lock = new byte[0];



    public static  final String MYSQL_JDBC_DRIVER = "mysql.jdbc.driver";
    public static  final String MYSQL_JDBC_URL= "mysql.jdbc.url";
    public static  final String MYSQL_JDBC_USER = "mysql.jdbc.user";
    public static  final String MYSQL_JDBC_PASSWD = "mysql.jdbc.passwd";


    static {
        try {
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(COMMON_FILE);
            if (properties == null) {
                synchronized (lock) {
                    if (properties == null) {
                        properties = new Properties();
                    }
                }
            }
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static {
        try {
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(BASE_FILE);
            if (baseProperties == null) {
                synchronized (lock) {
                    if (baseProperties == null) {
                        baseProperties = new Properties();
                    }
                }
            }
            baseProperties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object getPropertyValue(String key){
        return properties.get(key);
    }

    public static Object getBasePropertyValue(String key){
        return baseProperties.get(key);
    }

}
