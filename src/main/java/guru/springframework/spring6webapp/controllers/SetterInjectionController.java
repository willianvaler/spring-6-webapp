package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController
{
    GreetingService greetingService;

    @Autowired
    public void setGreetingService( GreetingService greetingService )
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
