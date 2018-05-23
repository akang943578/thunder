package com.david.thunder.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by jiakang on 2018/5/23
 *
 * @author jiakang
 */
public class ThunderNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("referer", new ThunderBeanDefinitionParser());
    }
}