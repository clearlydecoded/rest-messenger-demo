package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.MessageResponse;
import com.clearlydecoded.messenger.demo.model.Cookie;
import java.util.Objects;

public class GingerCookieOrderResponse implements MessageResponse {

  private Cookie gingerCookie;

  public GingerCookieOrderResponse() {
  }

  public GingerCookieOrderResponse(Cookie gingerCookie) {
    this.gingerCookie = gingerCookie;
  }

  public Cookie getGingerCookie() {
    return gingerCookie;
  }

  public void setGingerCookie(Cookie gingerCookie) {
    this.gingerCookie = gingerCookie;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GingerCookieOrderResponse that = (GingerCookieOrderResponse) o;
    return Objects.equals(gingerCookie, that.gingerCookie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gingerCookie);
  }

  @Override
  public String toString() {
    return "GingerCookieOrderResponse{" +
        "gingerCookie=" + gingerCookie +
        '}';
  }
}
