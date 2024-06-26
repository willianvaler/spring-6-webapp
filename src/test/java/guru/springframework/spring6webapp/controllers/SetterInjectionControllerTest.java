package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectionControllerTest
{
    @Autowired
    SetterInjectionController controller;

//    @BeforeEach
//    void setUp()
//    {
//        controller = new SetterInjectionController();
//        controller.setGreetingService( new GreetingServiceImpl() );
//    }

    @Test
    void sayHello()
    {
        System.out.println( controller.sayHello() );
    }
}