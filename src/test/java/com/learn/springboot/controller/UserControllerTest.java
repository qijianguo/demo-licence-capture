package com.learn.springboot.controller;

import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by qijianguo on 2017/8/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class UserControllerTest {

    private MockMvc mvc;

    private RequestBuilder request = null;
    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    /**
     * 查询， 断言为空
     *
     * @throws Exception
     */
    @Test
    public void getUserList() throws Exception {
        request = get("/users/");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[]")));
    }

    /**
     * 保存， 断言success
     *
     * @throws Exception
     */
    @Test
    public void postUser() throws Exception {
        request = post("/users/")
                .param("id", "1")
                .param("name", "Angus")
                .param("age", "18");
        mvc.perform(request).andExpect(content().string(equalTo("success")));
    }

    @Test
    public void putUser() throws Exception {
        request = get("/users/");
        mvc.perform(request).andExpect(status().isOk()).andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"Angus\",\"age\":18}]")));
    }

    @Test
    public void deleteUser() throws Exception {
        request = delete("/user/1");
        mvc.perform(request).andExpect(content().string(equalTo("success")));
    }

}