package com.david.thunder.test.bean;

import cn.hutool.core.util.StrUtil;
import org.springframework.stereotype.Service;

/**
 * Created by jiakang on 2018/5/23
 *
 * @author jiakang
 */
@Service
public class UserServiceImpl implements UserService {

    public String sayHello(String name) {
        return StrUtil.format("Hello, {}", name);
    }
}