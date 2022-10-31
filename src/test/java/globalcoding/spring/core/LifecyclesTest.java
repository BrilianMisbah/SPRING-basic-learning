/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalcoding.spring.core;

import globalcoding.spring.core.data.Connection;
import globalcoding.spring.core.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author gloding
 */
public class LifecyclesTest {
    
    private ConfigurableApplicationContext applicationContext;
    
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifecycleConfiguration.class);
        applicationContext.registerShutdownHook();
        
    }
    
    @AfterEach
    void destroy(){
        applicationContext.close();
    }
    
    @Test
    void testConnection(){
        Connection connection = applicationContext.getBean(Connection.class);
    }
       
    @Test
    void testServer(){
        Server server = applicationContext.getBean(Server.class);
    }
}
