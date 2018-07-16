/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo.processor;

import com.clearlydecoded.messenger.AbstractMessageProcessor;
import com.clearlydecoded.messenger.demo.message.GingerCookieOrder;
import com.clearlydecoded.messenger.demo.message.GingerCookieOrderResponse;
import com.clearlydecoded.messenger.demo.model.Cookie;
import com.clearlydecoded.messenger.demo.service.CookieStoreService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Demo class that is a processor for {@link GingerCookieOrder} message.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@Service
public class GingerCookieOrderProcessor extends
    AbstractMessageProcessor<GingerCookieOrder, GingerCookieOrderResponse> {

  @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
  @Autowired
  @Setter
  private CookieStoreService cookieStoreService;

  @Override
  public GingerCookieOrderResponse process(GingerCookieOrder message) {
    Cookie gingerCookie = cookieStoreService.giveMeFirstOneWithAdditionOf("Ginger");
    return new GingerCookieOrderResponse(gingerCookie);
  }
}
