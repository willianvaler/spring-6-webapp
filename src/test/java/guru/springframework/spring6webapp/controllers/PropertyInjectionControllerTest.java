package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest
{
    private PropertyInjectionController controller;

    @BeforeEach
    void setUp()
    {
        controller = new PropertyInjectionController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello()
    {
        System.out.println(controller.sayHello());
    }
}