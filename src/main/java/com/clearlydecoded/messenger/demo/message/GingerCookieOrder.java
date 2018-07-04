package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.Message;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GingerCookieOrder implements Message<GingerCookieOrderResponse> {

  public static final String TYPE = "FirstAvailableGingerCookieOrder";

  private final String type = TYPE;

  @Override
  public String getType() {
    return type;
  }
}
