package com.baiya.study2024.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BService {

    @Autowired
    private CService cService;

//    @Autowired
//    public BService(CService cService) {
//        this.cService = cService;
//    }
}
