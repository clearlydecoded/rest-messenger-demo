package com.clearlydecoded.commander.demo.command;

import com.clearlydecoded.commander.Command;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonCommand implements Command<PersonCommandResponse> {

  public static String TYPE = "PersonCommand";

  private final String type = TYPE;

  private Person person;

  @Override
  public String getType() {
    return type;
  }
}
