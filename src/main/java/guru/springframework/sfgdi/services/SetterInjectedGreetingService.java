package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingServices {
    @Override
    public String sayGreeting() {
        return "HelloWorld - Setter";
    }
}
