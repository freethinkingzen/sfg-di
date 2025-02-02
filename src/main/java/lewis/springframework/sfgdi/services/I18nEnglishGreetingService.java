package lewis.springframework.sfgdi.services;

import lewis.springframework.sfgdi.repositories.EnglishGreetingRepository;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Service;

//@Profile("EN") --Moved to java config--
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }

}
