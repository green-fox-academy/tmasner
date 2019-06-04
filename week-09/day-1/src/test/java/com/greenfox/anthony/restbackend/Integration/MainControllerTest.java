package com.greenfox.anthony.restbackend.Integration;

import com.greenfox.anthony.restbackend.controllers.MainController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
@AutoConfigureMockMvc
public class MainControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean

    @Test
    public void doulingIsReturnedCorrectly() throws  Exception {

        mockMvc.perform(get("/doubling?input=15"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.received").value("15"))
                .andExpect(jsonPath("$.result").value("30"));
    }

    @Test
    public void doublingErrorIsReturnedCorrectly() throws Exception {
        mockMvc.perform(get("/doubling"))
                .andExpect(status().is(200))
                .andExpect(jsonPath("$.error").value("Please provide an input!"));
    }
}
