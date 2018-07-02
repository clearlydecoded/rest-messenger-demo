package com.clearlydecoded.commander.demo.handler;

import com.clearlydecoded.commander.CommandHandler;
import com.clearlydecoded.commander.demo.command.GingerCookieOrder;
import com.clearlydecoded.commander.demo.command.GingerCookieOrderResponse;
import com.clearlydecoded.commander.demo.model.Cookie;
import com.clearlydecoded.commander.demo.service.CookieStoreService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GingerCookieOrderHandler implements
    CommandHandler<GingerCookieOrder, GingerCookieOrderResponse> {

  @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
  @Autowired
  @Setter
  private CookieStoreService cookieStoreService;

  @Override
  public GingerCookieOrderResponse execute(GingerCookieOrder command) {
    Cookie gingerCookie = cookieStoreService.giveMeFirstOneWithAdditionOf("Ginger");
    return new GingerCookieOrderResponse(gingerCookie);
  }

  @Override
  public String getCompatibleCommandType() {
    return GingerCookieOrder.TYPE;
  }

  @Override
  public Class<GingerCookieOrder> getCompatibleCommandClassType() {
    return GingerCookieOrder.class;
  }

  @Override
  public Class<GingerCookieOrderResponse> getCompatibleCommandResponseClassType() {
    return GingerCookieOrderResponse.class;
  }
}
