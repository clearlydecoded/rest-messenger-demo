package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaxSugarOrder implements Message<MaxSugarOrderResponse> {

  public static final String TYPE = "MaxSugarOrder";

  private final String type = TYPE;

  private int maxSugarInGrams;

  @Override
  public String getType() {
    return type;
  }
}
