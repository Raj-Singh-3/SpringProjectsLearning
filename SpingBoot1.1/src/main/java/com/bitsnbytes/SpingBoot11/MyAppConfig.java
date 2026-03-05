package com.bitsnbytes.SpingBoot11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {

    @Bean
    public MyComponent objectCreator()
    {
        return new MyComponent();
    }
}
