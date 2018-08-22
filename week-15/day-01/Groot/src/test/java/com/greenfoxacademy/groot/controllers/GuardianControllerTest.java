package com.greenfoxacademy.groot.controllers;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private MediaType contentType = new MediaType(MediaType.TEXT_PLAIN.getType(),
            MediaType.TEXT_PLAIN.getSubtype(),
            Charset.forName("utf8"));

    private MediaType contentTypeResult = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));


    @Test
    public void translateGroot_successful_method1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/groot")
                .contentType(contentType)
                .content("some text"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentTypeResult))
                .andExpect(content().string("{\"received\":\"some text\",\"translated\":\"I am Groot!\"}"));

    }

    @Test
    public void translateGroot_successful_method2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/groot")
                .contentType(contentType)
                .content("some text"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentTypeResult))
                .andExpect(jsonPath("$.received", is("some text")))
                .andExpect(jsonPath("$.translated", is("I am Groot!")));

    }

    @Test
    public void translateGroot_successful_method3() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/groot")
                .contentType(contentType)
                .content("some text");

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();

        String outputString = response.getContentAsString();
        String expected = "{\"received\":\"some text\",\"translated\":\"I am Groot!\"}";
        assertEquals(expected, outputString);
        assertEquals(HttpStatus.OK.value(), response.getStatus());

    }

    @Test
    public void translateGroot_unsuccessful_method1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/groot")
                .contentType(contentType))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(contentTypeResult))
                .andExpect(content().string("{\"error\":\"I am Groot!\"}"));

    }

    @Test
    public void translateGroot_unsuccessful_method2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/groot")
                .contentType(contentType))
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(contentTypeResult))
                .andExpect(jsonPath("$.error", is("I am Groot!")));
    }

    @Test
    public void translateGroot_unsuccessful_method3() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/groot")
                .contentType(contentType);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();

        String outputString = response.getContentAsString();
        String expected = "{\"error\":\"I am Groot!\"}";
        assertEquals(expected, outputString);
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatus());

    }


}
