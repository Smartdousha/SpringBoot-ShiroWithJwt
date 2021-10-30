package me.dousha.securitylogin.database;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dousha <dousha0w0@vip.qq.com>
 * @date 2021/10/30
 * @project SecurityLogin
 */
public class DataSource {
    private static final Map<String, Map<String, String>> data = new HashMap<>();

    static {
        Map<String, String> data1 = new HashMap<>();
        data1.put("password", "smith123");
        data1.put("role", "user");
        data1.put("permission", "view");

        Map<String, String> data2 = new HashMap<>();
        data2.put("password", "danny123");
        data2.put("role", "admin");
        data2.put("permission", "view,edit");

        data.put("smith", data1);
        data.put("danny", data2);
    }

    public static Map<String, Map<String, String>> getData() {
        return data;
    }
}
