package com.sise.dao.impl;

import com.sise.dao.TestDao;
import org.springframework.stereotype.Repository;

/**
 * Created by rola on 16-8-15.
 */
@Repository("testDaoImpl")
public class TestDaoImpl implements TestDao{

    public void insertTest() {
        System.out.println("in the TestDaoImpl testDao");
    }
}
