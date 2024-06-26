package guru.springframework.spring6webapp.services.i18n;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt, Spring Framework Guru.
 */

@Profile({"EN", "default"})
@Service("i18NService")
public class EnglishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
