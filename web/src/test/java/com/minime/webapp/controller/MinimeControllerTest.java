package com.minime.webapp.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.server.RequestBuilder;
import org.springframework.test.web.server.request.MockMvcRequestBuilders;
import org.springframework.test.web.server.result.MockMvcResultMatchers;
import org.springframework.test.web.server.setup.MockMvcBuilders;

import com.minime.domain.ProfileServiceImpl;

import static org.junit.matchers.JUnitMatchers.containsString;
import static org.springframework.test.web.server.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.server.setup.MockMvcBuilders.standaloneSetup;

public class MinimeControllerTest {

    private MinimeController controller;

    @Before
    public void setUp() throws Exception {
        controller = new MinimeController(new ProfileServiceImpl());
    }

    @Test
    public void testGreet() throws Exception {
        standaloneSetup(controller).build().perform((get("/profile/aneeshpu"))).andExpect(content().string(containsString("Aneesh")));
    }
}
