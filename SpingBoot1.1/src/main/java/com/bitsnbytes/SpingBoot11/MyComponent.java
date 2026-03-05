package com.bitsnbytes.SpingBoot11;

import org.springframework.stereotype.Component;

public class MyComponent {
    public MyComponent()
    {
        System.out.println("Message from MyComponet");
    }
    public void getMsg()
    {
        System.out.println("Message from getMsg");
    }
}
