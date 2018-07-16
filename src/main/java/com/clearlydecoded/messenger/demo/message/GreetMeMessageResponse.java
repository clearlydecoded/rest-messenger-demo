/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.MessageResponse;
import java.util.Objects;

/**
 * Demo class that contains a response to the greeting request message.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
public class GreetMeMessageResponse implements MessageResponse {

  /**
   * The actual data we want as the response.
   */
  private String greeting;

  /**
   * MUST at least have a no-arg constructor.
   **/
  public GreetMeMessageResponse() {
  }

  public GreetMeMessageResponse(String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GreetMeMessageResponse that = (GreetMeMessageResponse) o;
    return Objects.equals(greeting, that.greeting);
  }

  @Override
  public int hashCode() {

    return Objects.hash(greeting);
  }

  @Override
  public String toString() {
    return "GreetMeMessageResponse{" +
        "greeting='" + greeting + '\'' +
        '}';
  }
}
