package fr.icchoirlyon.config;

import fr.icchoirlyon.dao.PersonRepository;
import fr.icchoirlyon.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public PersonService personService() {
        return new PersonServiceImpl();
    }

    @Bean
    public VoiceService voiceService() {
        return new VoiceServiceImpl();
    }

    @Bean
    public InstrumentService instrumentService() {
        return new InstrumentServiceImpl();
    }
}
