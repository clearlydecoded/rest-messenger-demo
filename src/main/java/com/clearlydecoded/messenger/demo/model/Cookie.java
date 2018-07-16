/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 * {@link Cookie} simple model class.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
public class Cookie implements Serializable {

  private String name;

  private int sugarInGrams;

  private String[] additions;

  public Cookie() {
  }

  public Cookie(String name, int sugarInGrams, String[] additions) {
    this.name = name;
    this.sugarInGrams = sugarInGrams;
    this.additions = additions;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSugarInGrams() {
    return sugarInGrams;
  }

  public void setSugarInGrams(int sugarInGrams) {
    this.sugarInGrams = sugarInGrams;
  }

  public String[] getAdditions() {
    return additions;
  }

  public void setAdditions(String[] additions) {
    this.additions = additions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cookie cookie = (Cookie) o;
    return sugarInGrams == cookie.sugarInGrams &&
        Objects.equals(name, cookie.name) &&
        Arrays.equals(additions, cookie.additions);
  }

  @Override
  public int hashCode() {

    int result = Objects.hash(name, sugarInGrams);
    result = 31 * result + Arrays.hashCode(additions);
    return result;
  }

  @Override
  public String toString() {
    return "Cookie{" +
        "name='" + name + '\'' +
        ", sugarInGrams=" + sugarInGrams +
        ", additions=" + Arrays.toString(additions) +
        '}';
  }
}
