package com.clearlydecoded.messenger.demo.service;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationConfig.class)
@AutoConfigureMockMvc
public class MessageRestEndpointTest {

  @Autowired
  private MockMvc mvc;

//  //  @Test
//  public void testGetAvailableCommands() throws Exception {
//    mvc.perform(get("/process")).andDo(print());
//    //        .contentType(MediaType.APPLICATION_JSON))
//    //        .andExpect(status().isOk())
//    //        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
//    //        .andExpect(content().string(expectedResponseString));
//  }

  @Test
  public void testGetAvailableCommands() throws Exception {
    mvc.perform(get("/process")).andDo(print());
    //        .contentType(MediaType.APPLICATION_JSON))
    //        .andExpect(status().isOk())
//            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    //        .andExpect(content().string(expectedResponseString));
  }

}
