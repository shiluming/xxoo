package com.sise.service.Impl;

import com.sise.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by rola on 16-8-15.
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService{

    public void insetService() {
        System.out.println("in TestServiceImpl insertService()");
    }
}
