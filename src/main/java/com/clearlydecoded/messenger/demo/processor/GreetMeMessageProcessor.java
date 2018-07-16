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
import com.clearlydecoded.messenger.demo.message.GreetMeMessage;
import com.clearlydecoded.messenger.demo.message.GreetMeMessageResponse;
import org.springframework.stereotype.Service;

/**
 * Demo class that is a processor for the {@link GreetMeMessage} message.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@Service // Must have this annotation for Spring to discover the class
public class GreetMeMessageProcessor extends
    AbstractMessageProcessor<GreetMeMessage, GreetMeMessageResponse> {

  @Override
  public GreetMeMessageResponse process(GreetMeMessage message) {

    // This is where you write the actual business logic
    return new GreetMeMessageResponse("Hello " + message.getMyName());
  }
}
