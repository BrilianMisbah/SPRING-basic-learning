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
public class DuplicateBeanConfiguration {
    
    @Primary
    @Bean
    public Foo foo1(){
        Foo foo = new Foo();
        return foo;
    } 
    
    @Bean
    public Foo foo2(){
        Foo foo = new Foo();
        return foo;
    } 
}
