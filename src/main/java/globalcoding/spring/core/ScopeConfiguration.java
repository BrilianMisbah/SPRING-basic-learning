/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalcoding.spring.core;

import globalcoding.spring.core.data.Bar;
import globalcoding.spring.core.data.Foo;
import globalcoding.spring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author gloding
 */
@Slf4j
@Configuration
public class ScopeConfiguration {
    
    // scope 
    // 1. singleton
    // 2. prototype
    // 3. request
    // 4. session
    // 5. application
    // 6. websocket
    
    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new foo");
        return new Foo();
    }
    
    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }
    
    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }
}
