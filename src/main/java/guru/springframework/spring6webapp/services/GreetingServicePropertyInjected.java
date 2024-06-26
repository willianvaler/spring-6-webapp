package guru.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService") //custom spring bean name
public class GreetingServicePropertyInjected implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "friends dont let friends to property injection";
    }
}
