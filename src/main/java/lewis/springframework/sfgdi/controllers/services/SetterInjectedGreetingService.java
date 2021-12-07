package lewis.springframework.sfgdi.controllers.services;

import org.springframework.stereotype.Service;

//@Service --Moved to java config--
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
