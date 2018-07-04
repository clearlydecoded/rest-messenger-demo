package com.clearlydecoded.messenger.demo.service;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = ApplicationConfig.class)
//@AutoConfigureMockMvc
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

}
