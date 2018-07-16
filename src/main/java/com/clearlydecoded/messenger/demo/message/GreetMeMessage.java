/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.Message;
import java.util.Objects;

/**
 * Demo class that requests a greeting with a supplied name.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
public class GreetMeMessage implements Message<GreetMeMessageResponse> {

  /**
   * Set up the required message type identifier like so.
   * There are other ways to define it, but this approach is nice.
   */
  public static final String TYPE = "GreetMe";
  private final String type = TYPE;

  /**
   * The actual data we want to pass to the processor.
   */
  private String myName;

  /**
   * MUST at least have a no-arg constructor.
   */
  public GreetMeMessage() {
  }

  public GreetMeMessage(String myName) {
    this.myName = myName;
  }

  public String getMyName() {
    return myName;
  }

  public void setMyName(String myName) {
    this.myName = myName;
  }

  @Override // This is a required interface method
  public String getType() {
    return type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GreetMeMessage that = (GreetMeMessage) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(myName, that.myName);
  }

  @Override
  public int hashCode() {

    return Objects.hash(type, myName);
  }

  @Override
  public String toString() {
    return "GreetMeMessage{" +
        "type='" + type + '\'' +
        ", myName='" + myName + '\'' +
        '}';
  }
}
