package com.clearlydecoded.messenger.demo.processor;

import com.clearlydecoded.messenger.MessageProcessor;
import com.clearlydecoded.messenger.demo.message.SugarComaCookieOrder;
import com.clearlydecoded.messenger.demo.message.SugarComaCookieOrderResponse;
import com.clearlydecoded.messenger.demo.model.Cookie;
import com.clearlydecoded.messenger.demo.service.CookieStoreService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SugarComaCookieOrderHandler implements
    MessageProcessor<SugarComaCookieOrder, SugarComaCookieOrderResponse> {

  @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
  @Autowired
  @Setter
  private CookieStoreService cookieStoreService;

  @Override
  public SugarComaCookieOrderResponse process(SugarComaCookieOrder message) {
    Cookie comaCookie = cookieStoreService.giveMeSugarComaCookie();
    return new SugarComaCookieOrderResponse(comaCookie);
  }

  @Override
  public String getCompatibleMessageType() {
    return SugarComaCookieOrder.TYPE;
  }

  @Override
  public Class<SugarComaCookieOrder> getCompatibleMessage() {
    return SugarComaCookieOrder.class;
  }

  @Override
  public Class<SugarComaCookieOrderResponse> getCompatibleMessageResponseClassType() {
    return SugarComaCookieOrderResponse.class;
  }
}
