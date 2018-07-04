package com.clearlydecoded.messenger.demo.processor;

import com.clearlydecoded.messenger.MessageProcessor;
import com.clearlydecoded.messenger.demo.message.GingerCookieOrder;
import com.clearlydecoded.messenger.demo.message.GingerCookieOrderResponse;
import com.clearlydecoded.messenger.demo.model.Cookie;
import com.clearlydecoded.messenger.demo.service.CookieStoreService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GingerCookieOrderHandler implements
    MessageProcessor<GingerCookieOrder, GingerCookieOrderResponse> {

  @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
  @Autowired
  @Setter
  private CookieStoreService cookieStoreService;

  @Override
  public GingerCookieOrderResponse process(GingerCookieOrder message) {
    Cookie gingerCookie = cookieStoreService.giveMeFirstOneWithAdditionOf("Ginger");
    return new GingerCookieOrderResponse(gingerCookie);
  }

  @Override
  public String getCompatibleMessageType() {
    return GingerCookieOrder.TYPE;
  }

  @Override
  public Class<GingerCookieOrder> getCompatibleMessage() {
    return GingerCookieOrder.class;
  }

  @Override
  public Class<GingerCookieOrderResponse> getCompatibleMessageResponseClassType() {
    return GingerCookieOrderResponse.class;
  }
}
