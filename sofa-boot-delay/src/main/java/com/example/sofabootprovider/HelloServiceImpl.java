/*
 * Ant Group
 * Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.example.sofabootprovider;

/**
 * @author chengming
 * @version HelloServiceImpl.java, v 0.1 2024年02月22日 5:54 PM chengming
 */
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}