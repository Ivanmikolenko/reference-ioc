
package org.example.processor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class LoggingBeanPostProcessor
        implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(
            Object bean, String beanName) {

        System.out.println(
                "[Before initialization] " + beanName
        );

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(
            Object bean, String beanName) {

        System.out.println(
                "[After initialization] " + beanName
        );

        return bean;
    }
}
