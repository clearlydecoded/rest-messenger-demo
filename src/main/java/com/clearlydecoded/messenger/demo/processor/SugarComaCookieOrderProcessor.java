/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo.processor;

import com.clearlydecoded.messenger.MessageProcessor;
import com.clearlydecoded.messenger.demo.message.SugarComaCookieOrder;
import com.clearlydecoded.messenger.demo.message.SugarComaCookieOrderResponse;
import com.clearlydecoded.messenger.demo.model.Cookie;
import com.clearlydecoded.messenger.demo.service.CookieStoreService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Demo class that is a processor for the {@link SugarComaCookieOrder} message.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@Service // Must have this annotation for Spring to discover the class
public class SugarComaCookieOrderProcessor implements
    MessageProcessor<SugarComaCookieOrder, SugarComaCookieOrderResponse> {

  @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
  @Autowired
  @Setter
  private CookieStoreService cookieStoreService;

  @Override
  public SugarComaCookieOrderResponse process(SugarComaCookieOrder message) {
    // This is where you write the actual business logic
    Cookie comaCookie = cookieStoreService.giveMeSugarComaCookie();
    return new SugarComaCookieOrderResponse(comaCookie);
  }

  @Override
  public String getCompatibleMessageType() {
    // SEE! Defining that TYPE as public static final paid off!
    // You certainly CAN just hardcode a string here, but this is more robust.
    // Don't worry, if you mess this up, the validation at startup will catch it
    return SugarComaCookieOrder.TYPE;
  }

  @Override
  public Class<SugarComaCookieOrder> getCompatibleMessageClassType() {
    return SugarComaCookieOrder.class; // not possible to mess up here
  }

  @Override
  public Class<SugarComaCookieOrderResponse> getCompatibleMessageResponseClassType() {
    return SugarComaCookieOrderResponse.class; // not possible to mess up here
  }
}
