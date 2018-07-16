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
import com.clearlydecoded.messenger.demo.model.Cookie;
import java.util.Objects;

/**
 * Demo class that contains the cookie that has the most sugar content in the store.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
public class SugarComaCookieOrderResponse implements MessageResponse {

  private Cookie sugarComaCookie;

  public SugarComaCookieOrderResponse() {
  }

  public SugarComaCookieOrderResponse(Cookie sugarComaCookie) {
    this.sugarComaCookie = sugarComaCookie;
  }

  public Cookie getSugarComaCookie() {
    return sugarComaCookie;
  }

  public void setSugarComaCookie(Cookie sugarComaCookie) {
    this.sugarComaCookie = sugarComaCookie;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SugarComaCookieOrderResponse that = (SugarComaCookieOrderResponse) o;
    return Objects.equals(sugarComaCookie, that.sugarComaCookie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sugarComaCookie);
  }

  @Override
  public String toString() {
    return "SugarComaCookieOrderResponse{" +
        "sugarComaCookie=" + sugarComaCookie +
        '}';
  }
}
