package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.MessageResponse;
import java.util.Objects;

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
