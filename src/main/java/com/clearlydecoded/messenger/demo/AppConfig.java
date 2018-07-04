package com.clearlydecoded.messenger.demo;

import com.clearlydecoded.messenger.rest.SpringRestMessenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link AppConfig} is a configuration class for the rest-messenger-demo web application.
 */
@Configuration
public class AppConfig {

  /**
   * Creates the REST endpoint controller that processes REST message requests.
   *
   * @param springContext Spring Application Context (automatically injected by Spring).
   * @return REST endpoint controller instance injected into Spring Context to process REST message
   * requests.
   */
  @Bean
  protected SpringRestMessenger createSpringRestMessenger(ApplicationContext springContext) {
    return new SpringRestMessenger(springContext);
  }
}
