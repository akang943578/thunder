package com.david.thunder.test;

import cn.hutool.core.lang.Console;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/5/23
 *
 * @author jiakang
 */
public class ThunderServer {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("thunder-server.xml");
        Console.log("server started...");
    }
}