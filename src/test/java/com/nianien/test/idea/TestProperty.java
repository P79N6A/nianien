package com.nianien.test.idea;

import com.nianien.idea.properties.Properties;

import org.junit.Test;

public class TestProperty {

    @Test
    public void test() {

        Properties pp = new Properties("properties.xml");
        String sql = pp.getProperty("delete");
        System.out.println(sql);
        sql = pp.defaultPackage("users").getProperty("update");
        System.out.println(sql);
    }
}
