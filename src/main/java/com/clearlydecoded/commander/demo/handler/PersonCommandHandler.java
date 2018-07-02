package com.clearlydecoded.commander.demo.handler;

import com.clearlydecoded.commander.CommandHandler;
import com.clearlydecoded.commander.demo.command.PersonCommand;
import com.clearlydecoded.commander.demo.command.PersonCommandResponse;
import org.springframework.stereotype.Service;

@Service
public class PersonCommandHandler implements CommandHandler<PersonCommand, PersonCommandResponse> {

  @Override
  public PersonCommandResponse execute(PersonCommand command) {
    return null;
  }

  @Override
  public String getCompatibleCommandType() {
    return PersonCommand.TYPE;
  }

  @Override
  public Class<PersonCommand> getCompatibleCommandClassType() {
    return PersonCommand.class;
  }

  @Override
  public Class<PersonCommandResponse> getCompatibleCommandResponseClassType() {
    return PersonCommandResponse.class;
  }
}
