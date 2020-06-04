package kr.irolab.will.userno;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import com.fasterxml.jackson.databind.ObjectMapper;

import kr.irolab.will.rest.userno.member.WillMemberService;
import lombok.extern.slf4j.Slf4j;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
class WillMemberControllerTest {

	@Autowired
	MockMvc mvc;
	
	@Autowired
	private WillMemberService service;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	public void before() {
//		mvc = MockMvcBuilders.standaloneSetup(WillMemberController.class)
//				.alwaysExpect(MockMvcResultMatchers.status().isOk()).build();
//	}

	@Test
	void memberTest() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders.post("api/userno/{user_no}").accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.model().attribute("userName", "임꺽정"))
				.andDo(MockMvcResultHandlers.print());	
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mvc);
		log.info("json {}", json);
	}

}
