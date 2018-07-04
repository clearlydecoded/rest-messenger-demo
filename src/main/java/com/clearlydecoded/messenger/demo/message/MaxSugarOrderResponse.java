package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.MessageResponse;
import com.clearlydecoded.messenger.demo.model.Cookie;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaxSugarOrderResponse implements MessageResponse {

  private List<Cookie> cookies;

  private int sugarTotal;

}
