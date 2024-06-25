package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.GreetingService;

public class PropertyInjectionController
{
    GreetingService greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
