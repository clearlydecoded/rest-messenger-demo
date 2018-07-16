/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package com.clearlydecoded.messenger.demo.service;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import com.clearlydecoded.messenger.demo.message.GreetMeMessage;
import com.clearlydecoded.messenger.demo.message.GreetMeMessageResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

/**
 * Spot tests the functionality of the message processors when everything is wired in as an app.
 *
 * @author Yaakov Chaikin (yaakov@ClearlyDecoded.com)
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationConfig.class)
@AutoConfigureMockMvc
public class MessageRestEndpointTest {

  @Autowired
  private MockMvc mvc;

  @Test
  public void testSendGreetMeMessage() throws Exception {

    GreetMeMessage greetMe = new GreetMeMessage("Yaakov");
    GreetMeMessageResponse expectedResponse = new GreetMeMessageResponse("Hello Yaakov");
    ObjectMapper mapper = new ObjectMapper();
    String greetMeString = mapper.writeValueAsString(greetMe);
    String expectedResponseString = mapper.writeValueAsString(expectedResponse);

    mvc.perform(post("/process").accept(MediaType.APPLICATION_JSON).content(greetMeString)
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(content().string(expectedResponseString));
  }

  @Test
  public void testGetDocsPage() throws Exception {
    MvcResult result = mvc.perform(get("/process"))
        .andExpect(status().isOk())
        .andExpect(view().name("SpringRestProcessorDocumentation"))
        .andExpect(content().contentType(MediaType.TEXT_HTML_VALUE + ";charset=UTF-8"))
        .andReturn();

    String stringResult = result.getResponse().getContentAsString();
    assertTrue("Response should at least contain snippet of HTML page.",
        stringResult.contains("Spring REST Messenger Docs"));
  }

}
