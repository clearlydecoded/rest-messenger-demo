package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.Message;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SugarComaCookieOrder implements Message<SugarComaCookieOrderResponse> {

  public static final String TYPE = "SugarComaCookieOrder";

  private final String type = TYPE;

  @Override
  public String getType() {
    return type;
  }
}
