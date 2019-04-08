package com.xiaojukeji;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App
{
    static Logger logger = LogManager.getLogger(App.class.getName());
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        String mysqlUser =  MavenProfileTest.getMysqlUser();
        String mysqlDriver = MavenProfileTest.getMysqlDriver();
        logger.info("你使用的MySQDriver是：{},你使用的MySQLuser是：{}",mysqlDriver,mysqlUser);
        JSONObject jsonObject = JSON.parseObject("{\"某公司CEO\":\"东哥\",\"结婚\":\"某妹\",\"第三者\":\"某学生\"}");
        System.out.println(String.format("解析的jsonObject是:%s,\n 某公司CEO%s和%s结婚,但又跟%s发生了不正当关系",jsonObject,jsonObject.get("某公司CEO"),jsonObject.get("结婚"),jsonObject.get("第三者")));

        logger.info("解析的jsonObject是:{},\n 某公司CEO{}和{}结婚,但又跟{}发生了不正当关系",jsonObject,jsonObject.get("某公司CEO"),jsonObject.get("结婚"),jsonObject.get("第三者"));
    }
}
