/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo.service;

import static org.junit.Assert.assertEquals;

import com.clearlydecoded.messenger.demo.model.Cookie;
import java.util.List;
import org.junit.Test;

/**
 * Tests the functionality of the {@link CookieStoreService} class.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
public class CookieStoreServiceTest {

  private CookieStoreService cookieStoreService = new CookieStoreService();

  @Test
  public void testGiveMeSugarComaCookie() {
    Cookie mostSugaryCookie = cookieStoreService.giveMeSugarComaCookie();
    Cookie expectedCookie = new Cookie("Sugar Sugar", 300,
        new String[]{"sugar", "more sugar", "even more sugar", "diabetes"});

    assertEquals("Should be the most sugar value cookie", expectedCookie, mostSugaryCookie);
  }

  @Test
  public void testGiveMeFirstOneWithAdditionOfGinger() {
    Cookie gingerCookie = cookieStoreService.giveMeFirstOneWithAdditionOf("Ginger");
    Cookie expectedCookie = new Cookie("Ginger", 60, new String[]{"ginger", "sugar"});

    assertEquals("Should be the first ginger cookie.", expectedCookie, gingerCookie);
  }

  @Test
  public void testGiveMeCookiesUpToMaxSugar115() {
    List<Cookie> cookies = cookieStoreService.giveMeCookiesUpToMaxSugar(115);

    assertEquals("Should return 4 cookies", 4, cookies.size());
  }

  @Test
  public void testGiveMeCookiesUpToMaxSugar845() {
    List<Cookie> cookies = cookieStoreService.giveMeCookiesUpToMaxSugar(845);

    assertEquals("Should return 12 cookies", 12, cookies.size());
  }
}
