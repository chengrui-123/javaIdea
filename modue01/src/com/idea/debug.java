package com.idea;

import java.util.HashMap;

/**
 * @author chenrui
 * @data 2019/6/30 - 22:35
 */
public class debug {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","aaa");
        map.put("b","bbb");
        map.put("c","ccc");
        map.put("d","ddd");
        String str = map.get("a");
        System.out.println("str = " + str);
        map.remove("a");
        System.out.println(map);

    }
}
