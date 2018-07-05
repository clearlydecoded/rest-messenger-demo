package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.Message;
import java.util.Objects;

public class GingerCookieOrder implements Message<GingerCookieOrderResponse> {

  public static final String TYPE = "FirstAvailableGingerCookieOrder";

  private final String type = TYPE;

  public GingerCookieOrder() {
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
    GingerCookieOrder that = (GingerCookieOrder) o;
    return Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    return "GingerCookieOrder{" +
        "type='" + type + '\'' +
        '}';
  }
}
