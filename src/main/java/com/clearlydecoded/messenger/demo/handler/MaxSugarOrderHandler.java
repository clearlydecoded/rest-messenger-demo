package com.clearlydecoded.messenger.demo.handler;

import com.clearlydecoded.messenger.MessageProcessor;
import com.clearlydecoded.messenger.demo.message.MaxSugarOrder;
import com.clearlydecoded.messenger.demo.message.MaxSugarOrderResponse;
import com.clearlydecoded.messenger.demo.model.Cookie;
import com.clearlydecoded.messenger.demo.service.CookieStoreService;
import java.util.List;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaxSugarOrderHandler implements
    MessageProcessor<MaxSugarOrder, MaxSugarOrderResponse> {

  @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
  @Autowired
  @Setter
  private CookieStoreService cookieStoreService;

  @Override
  public MaxSugarOrderResponse process(MaxSugarOrder message) {
    List<Cookie> cookies = cookieStoreService
        .giveMeCookiesUpToMaxSugar(message.getMaxSugarInGrams());

    // Loop over all cookies and add up total sugar
    int totalSugar = 0;
    for (Cookie cookie : cookies) {
      totalSugar += cookie.getSugarInGrams();
    }

    return new MaxSugarOrderResponse(cookies, totalSugar);
  }

  @Override
  public String getCompatibleMessageType() {
    return MaxSugarOrder.TYPE;
  }

  @Override
  public Class<MaxSugarOrder> getCompatibleMessage() {
    return MaxSugarOrder.class;
  }

  @Override
  public Class<MaxSugarOrderResponse> getCompatibleMessageResponseClassType() {
    return MaxSugarOrderResponse.class;
  }
}
