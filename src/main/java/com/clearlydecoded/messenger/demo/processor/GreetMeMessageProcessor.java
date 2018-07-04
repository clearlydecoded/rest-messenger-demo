package com.clearlydecoded.messenger.demo.processor;

import com.clearlydecoded.messenger.MessageProcessor;
import com.clearlydecoded.messenger.demo.message.GreetMeMessage;
import com.clearlydecoded.messenger.demo.message.GreetMeMessageResponse;
import org.springframework.stereotype.Service;

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
  public Class<GreetMeMessage> getCompatibleMessage() {
    return GreetMeMessage.class; // not possible to mess up here
  }

  @Override
  public Class<GreetMeMessageResponse> getCompatibleMessageResponseClassType() {
    return GreetMeMessageResponse.class; // not possible to mess up here
  }
}
