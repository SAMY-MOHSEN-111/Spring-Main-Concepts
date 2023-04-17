package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean(value = "department", initMethod = "",destroyMethod = "")
    @Scope("singleton")
    public Department department(){
        return new Department();
    }
}
