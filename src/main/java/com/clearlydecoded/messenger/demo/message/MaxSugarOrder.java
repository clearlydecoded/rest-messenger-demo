/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo.message;

import com.clearlydecoded.messenger.Message;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Demo class that requests a list of cookies whose sugar content adds up to the specified max sugar
 * in grams in this message.
 *
 * <p>
 * Also, this class demonstrates how to use Lombok annotations to achieve even clear POJO code.
 * </p>
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaxSugarOrder implements Message<MaxSugarOrderResponse> {

  private final String type = "MaxSugarOrder";

  @Min(value = 10, message = "'maxSugarInGrams' must be between 10 and 2000.")
  @Max(value = 2000, message = "'maxSugarInGrams' must be between 10 and 2000.")
  private int maxSugarInGrams;

  @Override
  public String getType() {
    return type;
  }
}
