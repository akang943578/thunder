package com.david.thunder.spring;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * Created by jiakang on 2018/5/23
 *
 * @author jiakang
 */
@Slf4j
public class ThunderBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    private static final String ID = "id";
    private static final String INTERFACE = "interface";
    private static final String DIRECT_URL = "directUrl";

    @Override
    protected Class<?> getBeanClass(Element element) {
        String refInterface = element.getAttribute(INTERFACE);
        Class<?> aClass = null;
        try {
            aClass = Class.forName(refInterface);
        } catch (ClassNotFoundException e) {
            log.warn("getBeanClass error, element:{}", element, e);
        }
        return aClass;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute(ID);
        String refInterface = element.getAttribute(INTERFACE);
        String directUrl = element.getAttribute(DIRECT_URL);
        if (StrUtil.isNotEmpty(id)) {
            builder.addPropertyValue(ID, id);
        }
        if (StrUtil.isNotEmpty(refInterface)) {
            builder.addPropertyValue(INTERFACE, refInterface);
        }
        if (StrUtil.isNotEmpty(directUrl)) {
            builder.addPropertyValue(DIRECT_URL, directUrl);
        }
    }
}