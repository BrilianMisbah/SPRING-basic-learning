/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalcoding.spring.core;

import globalcoding.spring.core.data.Connection;
import globalcoding.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author gloding
 */
@Configuration
public class LifecycleConfiguration {
    
    @Bean
    public Connection connection(){
        return new Connection();
    }
    
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server server(){
        return new Server();
    }
}
