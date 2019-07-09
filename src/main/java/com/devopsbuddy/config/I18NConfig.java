package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

    @Bean
    ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
        resourceBundleMessageSource.setBasename("i18n/messages");
        resourceBundleMessageSource.setCacheSeconds(1000);//check for new msg every 30 min
        return resourceBundleMessageSource;
    }
}
