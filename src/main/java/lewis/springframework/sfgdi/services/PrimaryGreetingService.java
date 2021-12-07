package lewis.springframework.sfgdi.services;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;

//@Primary -- Moved to Java config --
//@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Primary";
    }
}
