package com.clearlydecoded.commander.demo.handler;

import com.clearlydecoded.commander.CommandHandler;
import com.clearlydecoded.commander.demo.command.SugarComaCookieOrder;
import com.clearlydecoded.commander.demo.command.SugarComaCookieOrderResponse;
import com.clearlydecoded.commander.demo.model.Cookie;
import com.clearlydecoded.commander.demo.service.CookieStoreService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SugarComaCookieOrderHandler implements
    CommandHandler<SugarComaCookieOrder, SugarComaCookieOrderResponse> {

  @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
  @Autowired
  @Setter
  private CookieStoreService cookieStoreService;

  @Override
  public SugarComaCookieOrderResponse execute(SugarComaCookieOrder command) {
    Cookie comaCookie = cookieStoreService.giveMeSugarComaCookie();
    return new SugarComaCookieOrderResponse(comaCookie);
  }

  @Override
  public String getCompatibleCommandType() {
    return SugarComaCookieOrder.TYPE;
  }

  @Override
  public Class<SugarComaCookieOrder> getCompatibleCommandClassType() {
    return SugarComaCookieOrder.class;
  }

  @Override
  public Class<SugarComaCookieOrderResponse> getCompatibleCommandResponseClassType() {
    return SugarComaCookieOrderResponse.class;
  }
}
