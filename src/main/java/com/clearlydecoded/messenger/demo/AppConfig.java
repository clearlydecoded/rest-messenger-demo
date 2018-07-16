/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo;

import com.clearlydecoded.messenger.rest.SpringRestMessenger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link AppConfig} is a configuration class for the rest-messenger-demo web application.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
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
