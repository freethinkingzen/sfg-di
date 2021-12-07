package lewis.springframework.sfgdi.config;

import lewis.springframework.sfgdi.datasource.FakeDataSource;
import lewis.springframework.sfgdi.services.*;
import lewis.springframework.sfgdi.repositories.EnglishGreetingRepository;
import lewis.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${lewis.username}") String username,
                                  @Value ("${lewis.password}") String password,
                                  @Value ("${lewis.jdbcurl}") String jdbcurl) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setjdbcurl(jdbcurl);

        return fakeDataSource;
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    // @Bean --Defined in XML--
    // ConstructorGreetingService constructorGreetingService() { return new ConstructorGreetingService(); }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

}

