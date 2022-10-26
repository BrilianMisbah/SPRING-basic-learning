/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalcoding.spring.core;

import globalcoding.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author gloding
 */
public class BeanTest {
    
    @Test
    void testCreateBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        
        //Assertions.assertNotNull(context);
        Assertions.assertSame(foo1, foo2);
    }
}
