package guru.springframework.spring6webapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary //como temos 2 implementações de GreetingService, o teste falha,mas o @Primary faz com que esta classe seja o primeiro bean que seja injetado
@Service
public class GreetingServicePrimary implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return " hello from primaey bean";
    }
}
