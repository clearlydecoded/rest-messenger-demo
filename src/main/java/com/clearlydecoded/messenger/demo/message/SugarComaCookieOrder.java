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
 * Demo class that requests a return of the most sugary cookie in the store.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
public class SugarComaCookieOrder implements Message<SugarComaCookieOrderResponse> {

  /**
   * Set up the required message type identifier like so.
   * There are other ways to define it, but this approach is useful because this message will get
   * processed by a processor that implements the MessageProcessor interface and this public static
   * type makes it easy to use for a return type of getCompatibleMessageType method.
   */
  public static final String TYPE = "SugarComaCookieOrder";

  private final String type = TYPE;

  public SugarComaCookieOrder() {
  }

  @Override
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
    SugarComaCookieOrder that = (SugarComaCookieOrder) o;
    return Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    return "SugarComaCookieOrder{" +
        "type='" + type + '\'' +
        '}';
  }
}
