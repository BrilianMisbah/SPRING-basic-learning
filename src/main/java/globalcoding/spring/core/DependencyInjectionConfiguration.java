/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalcoding.spring.core;

import globalcoding.spring.core.data.Bar;
import globalcoding.spring.core.data.Foo;
import globalcoding.spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author gloding
 */
@Configuration
public class DependencyInjectionConfiguration {
    
    @Primary
    @Bean(value = "fooOne")
    public Foo foo1(){
        return new Foo();
    }
    
    @Bean(value = "fooTwo")
    public Foo foo2(){
        return new Foo();
    }
    
    @Bean 
    public Bar bar(){
        return new Bar();
    }
    
    @Bean
    public FooBar fooBar(@Qualifier("fooTwo") Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }
}
