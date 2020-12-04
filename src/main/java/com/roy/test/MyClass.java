package com.roy.test;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * description：
 * author：dingyawu
 * date：created in 10:58 2020/7/25
 * history:
 */
public class MyClass implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.roy.test.TestDemo3"};
    }
}
