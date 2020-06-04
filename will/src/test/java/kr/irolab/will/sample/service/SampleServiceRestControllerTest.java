package kr.irolab.will.sample.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.nio.charset.Charset;

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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class SampleServiceRestControllerTest {
	
	@Autowired
	MockMvc mvc;

	@Autowired
	private WebApplicationContext ctx;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println();
		System.out.println("SampleServiceRestControllerTest.setUp()");

		this.mvc = MockMvcBuilders.webAppContextSetup(ctx) //
				.addFilters(new CharacterEncodingFilter("UTF-8", true)) // 필터 추가
				.alwaysDo(print()).build();

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("SampleServiceRestControllerTest.tearDown()");
		System.out.println();
	}

	@Test
	void test1GetSucceed() throws Exception {
		MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/api/sample/service"))
				.andExpect(MockMvcResultMatchers.status().isOk()) //
				.andDo(MockMvcResultHandlers.print()) //
				.andReturn();
		log.info("result: {}", result);
	}

	public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

	@Test
	void test2PostSucceed() throws Exception {
		final Post post = new Post();
		post.setPostCatname("PostCatname-newer");
		post.setPostTitle("PostTitle-newer");
		post.setPostText("PostText-newer");
		post.setPostFile("PostFile-newer");
		post.setPostCreateDt("PostCreateDt-newer");

		ObjectMapper mapper = new ObjectMapper();
		final String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(post);

		MockHttpServletRequestBuilder content = MockMvcRequestBuilders.post("/api/sample/service") //
				.contentType(APPLICATION_JSON_UTF8) //
				.content(json);

		final MvcResult result = mvc.perform(content).andExpect(MockMvcResultMatchers.status().isOk()) //
				.andDo(MockMvcResultHandlers.print()) //
				.andReturn();
		log.info("result: {}", result);

		MvcResult getsResult = mvc.perform(MockMvcRequestBuilders.get("/api/sample/service"))
				.andExpect(MockMvcResultMatchers.status().isOk()) //
				.andDo(MockMvcResultHandlers.print()) //
				.andReturn();
		log.info("result: {}", getsResult);
	}

}
