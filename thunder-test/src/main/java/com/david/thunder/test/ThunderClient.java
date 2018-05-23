package com.david.thunder.test;

import cn.hutool.core.lang.Console;
import com.david.thunder.test.bean.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiakang on 2018/5/23
 *
 * @author jiakang
 */
public class ThunderClient {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("thunder-client.xml");
        UserService userService = ctx.getBean("remoteService", UserService.class);
        String result = userService.sayHello("David");
        Console.log("userService sayHello, name:{}, result:{}", "David", result);
    }
}