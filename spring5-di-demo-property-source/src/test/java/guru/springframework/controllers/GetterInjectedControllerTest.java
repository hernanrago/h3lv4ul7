package guru.springframework.controllers;

import org.junit.Before;
import org.junit.Test;

import h3lv4ul7.springframework.controllers.GetterInjectedController;
import h3lv4ul7.springframework.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}