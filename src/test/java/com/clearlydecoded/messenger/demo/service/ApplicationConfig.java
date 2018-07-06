package com.clearlydecoded.messenger.demo.service;

import com.clearlydecoded.messenger.rest.SpringRestMessenger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplicationConfig {

  @Bean
  public SpringRestMessenger createSpringRestCommander(ApplicationContext springContext) {
    return new SpringRestMessenger(springContext);
  }

}
