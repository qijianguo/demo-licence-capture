package com.learn.springboot;

import com.learn.springboot.controller.HelloController;
import com.learn.springboot.domain.Anthor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringbootApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootApplicationTests.class);

	@Test
	public void contextLoads() {
	}

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
	}

	/**
	 * 测试Hello World
	 * @throws Exception
	 */
	@Test
	public void getHello () throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Hello Spring Boot !")));
	}

	@Autowired
	private Anthor anthor;

	/**
	 * 加载配置文件
	 */
	@Test
	public void getProperty() {
		anthor.getAnthor();
		anthor.getEmail();
		logger.info("作者:{}, email: {}, desc: {}, luckyNum: {}, luckyString: {}",
				anthor.getAnthor(), anthor.getEmail(), anthor.getDesc(), anthor.getLuckyNum(), anthor.getLuckyString() );
	}

}
