package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    //o @qualifier sobrescreve o @primary da service, pq justamente especifica qual ele deseja receber
    public ConstructorInjectedController( @Qualifier("greetingServiceImpl") GreetingService greetingService )
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
