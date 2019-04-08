package com.xiaojukeji;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName DependencyTest
 * @Description TODO
 * @Author didi
 * @Date 2019/4/81:15 PM
 * @Version 1.0
 */
public class DependencyTest {
    public static JSONObject getJsonFromString(String jsonStr){
        return  JSON.parseObject(jsonStr);
    }
}
