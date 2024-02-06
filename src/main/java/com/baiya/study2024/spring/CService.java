package com.baiya.study2024.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CService {

//    @Autowired
    private AService aService;

    @Autowired
    public CService(AService aService) {
        this.aService = aService;
    }
}
