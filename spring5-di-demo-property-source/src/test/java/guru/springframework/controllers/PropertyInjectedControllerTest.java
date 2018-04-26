package guru.springframework.controllers;

import org.junit.Before;
import org.junit.Test;

import h3lv4ul7.springframework.controllers.PropertyInjectedController;
import h3lv4ul7.springframework.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}