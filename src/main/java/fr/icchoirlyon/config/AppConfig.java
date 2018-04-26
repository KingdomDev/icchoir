package fr.icchoirlyon.config;

import fr.icchoirlyon.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public VoiceService voiceService() {
        return new VoiceServiceImpl();
    }

    @Bean
    public InstrumentService instrumentService() {
        return new InstrumentServiceImpl();
    }
}
