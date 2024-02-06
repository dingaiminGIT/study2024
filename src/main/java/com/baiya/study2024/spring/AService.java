package com.baiya.study2024.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * springboot 2.6版本开始默认取消循环依赖的支持
 * https://www.springcloud.io/post/2022-02/spring-cyclic-dependencies/#gsc.tab=0
 * 可以用 spring.main.allow-circular-references=true 解决
 */
@Service
public class AService {

//    @Autowired
    private BService bService;

    @Autowired
    public AService(BService bService) {
        this.bService = bService;
    }
}
