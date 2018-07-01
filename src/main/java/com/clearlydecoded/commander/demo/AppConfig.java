package com.clearlydecoded.commander.demo;

import com.clearlydecoded.commander.rest.SpringRestCommander;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link AppConfig} is a configuration class for the rest-commander-demo web application.
 */
@Configuration
public class AppConfig {

  /**
   * Creates the REST endpoint controller that handles REST command requests.
   *
   * @param springContext Spring Application Context (automatically injected by Spring).
   * @return REST endpoint controller instance injected into Spring Context to handle REST command
   * requests.
   */
  @Bean
  protected SpringRestCommander createRestCommandExecutor(ApplicationContext springContext) {
    return new SpringRestCommander(springContext);
  }
}
