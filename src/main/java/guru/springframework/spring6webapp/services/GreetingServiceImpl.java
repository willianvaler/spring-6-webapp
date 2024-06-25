package guru.springframework.spring6webapp.services;

public class GreetingServiceImpl implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "hello";
    }
}
