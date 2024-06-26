package guru.springframework.spring6webapp.services.i18n;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */
@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
