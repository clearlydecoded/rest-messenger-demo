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
import com.clearlydecoded.messenger.demo.message.GreetMeMessage;
import com.clearlydecoded.messenger.demo.message.GreetMeMessageResponse;
import org.springframework.stereotype.Service;

/**
 * Demo class that is a processor for the {@link GreetMeMessage} message.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@Service // Must have this annotation for Spring to discover the class
public class GreetMeMessageProcessor implements
    MessageProcessor<GreetMeMessage, GreetMeMessageResponse> {

  @Override
  public GreetMeMessageResponse process(GreetMeMessage message) {

    // This is where you write the actual business logic
    return new GreetMeMessageResponse("Hello " + message.getMyName());
  }

  @Override
  public String getCompatibleMessageType() {
    // SEE! Defining that TYPE as public static final paid off!
    // You certainly CAN just hardcode a string here, but this is more robust.
    // Don't worry, if you mess this up, the validation at startup will catch it
    return GreetMeMessage.TYPE;
  }

  @Override
  public Class<GreetMeMessage> getCompatibleMessageClassType() {
    return GreetMeMessage.class; // not possible to mess up here
  }

  @Override
  public Class<GreetMeMessageResponse> getCompatibleMessageResponseClassType() {
    return GreetMeMessageResponse.class; // not possible to mess up here
  }
}
