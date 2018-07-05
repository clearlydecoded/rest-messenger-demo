package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.MessageResponse;
import com.clearlydecoded.messenger.demo.model.Cookie;
import java.util.Objects;

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
