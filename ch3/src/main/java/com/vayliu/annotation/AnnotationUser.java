package com.vayliu.annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 基于注解的依赖注入
 *
 * @author: VayLiu
 **/

@Component
/**
 * 这里的 @Component 相当于 @Component(value = "AnnotationUser")
 */
public class AnnotationUser {

    @Value("刘锐松")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnnotationUser{" +
                "name='" + name + '\'' +
                '}';
    }


}
