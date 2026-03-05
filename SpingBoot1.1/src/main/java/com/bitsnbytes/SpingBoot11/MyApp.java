package com.bitsnbytes.SpingBoot11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {
    @Autowired
    private MyComponent m1;

//    public MyApp(MyComponent m1)
//    {
//        this.m1 = m1;
//    }


    public void run()
    {
        m1.getMsg();
    }
//    @Autowired
//    public void setM1(MyComponent m1) {
//        this.m1 = m1;
//    }

}
