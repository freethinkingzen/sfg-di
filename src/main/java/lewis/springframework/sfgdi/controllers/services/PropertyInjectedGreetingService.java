package lewis.springframework.sfgdi.controllers.services;

import org.springframework.stereotype.Service;

//@Service --Moved to Java config--
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
