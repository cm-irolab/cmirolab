package kr.irolab.will.sample.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ResponsePayloadTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println();
		System.out.println("PostResponsePayloadTest.setUp()");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("PostResponsePayloadTest.tearDown()");
		System.out.println();
	}

	@Test
	void testPost() throws JsonProcessingException {
		System.out.println("PostResponsePayloadTest.testPost()");

		List<Post> list = new ArrayList();

		Post post = new Post();
		post.setPostNo(1);
		post.setPostCatname("매거진");
		post.setPostTitle("매거진제목");
		post.setPostText("매거진내용");
		post.setPostFile("url");
		post.setPostCreateDt("2020-01-30");

		list.add(post);

		ResponsePayload payload = new ResponsePayload();
		payload.setCode(200);
		payload.setMessage("Success");
		payload.setData(list);

		loggingJson(payload);
	}

	@Test
	void testWill() throws Exception {
		System.out.println("PostResponsePayloadTest.testWill()");

		final List<Will> list = new ArrayList<>();

		Will will = new Will();
		will.setWillNo(2);
		will.setWillTitle("안녕하십니까");
		will.setWillText("Lorem ipsum dolor sit ameta.");
		will.setWillCreateDt("2020-02-11");
		list.add(will);

		ResponsePayload payload = new ResponsePayload();
		payload.setCode(200);
		payload.setMessage("Success");
		payload.setData(list);

		loggingJson(payload);
	}

	@Test
	void testFailed() throws Exception {
		System.out.println("ResponsePayloadTest.testFailed()");

		ResponsePayload payload = new ResponsePayload();
		payload.setCode(500);
		payload.setMessage("Failed");

		loggingJson(payload);
	}

	private void loggingJson(ResponsePayload payload) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
		log.info("json {}", json);
	}

}
