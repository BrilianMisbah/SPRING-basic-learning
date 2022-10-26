/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalcoding.spring.core;

import globalcoding.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author gloding
 */
@Configuration
public class BeanNameConfiguration {
    
    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }
    
    @Bean(value = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
