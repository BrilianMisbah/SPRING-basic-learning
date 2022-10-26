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
public class DuplicateBeanTest {
    
    @Test
    void testDuplicateBean(){
        
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
        
        Assertions.assertNotNull(context);
    }
    
    @Test
    void testGetBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
        
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);
        
        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo1, foo2);
    }
}
