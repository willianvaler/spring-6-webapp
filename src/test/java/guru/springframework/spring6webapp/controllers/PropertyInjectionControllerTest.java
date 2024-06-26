package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectionControllerTest
{
    @Autowired
    private PropertyInjectionController controller;

//    @BeforeEach
//    void setUp()
//    {
//        controller = new PropertyInjectionController();
//        controller.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void sayHello()
    {
        System.out.println(controller.sayHello());
    }
}