package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController
{
    @Qualifier("propertyGreetingService")
    @Autowired //not recommended
    GreetingService greetingService;

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
