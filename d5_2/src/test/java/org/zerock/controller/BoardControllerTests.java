package org.zerock.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
@Log4j
public class BoardControllerTests {
	
	@Setter(onMethod_= {@Autowired})
	private WebApplicationContext context;
	
	private MockMvc mockMvc;
	
	@Before
	public void ready() {
		log.info("Ready");
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testGet1() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/calc/multi").param("a", "123").param("b", "456")).andReturn().getModelAndView().getView();
	}
	
	@Test
	public void testPost1() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/board/register").param("title", "테스트").param("content", "테스트").param("writer", "테스트")).andReturn().getModelAndView().getView();
	}
}
