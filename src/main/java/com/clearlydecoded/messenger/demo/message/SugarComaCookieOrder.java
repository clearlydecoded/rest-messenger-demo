package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.Message;
import java.util.Objects;

public class SugarComaCookieOrder implements Message<SugarComaCookieOrderResponse> {

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
