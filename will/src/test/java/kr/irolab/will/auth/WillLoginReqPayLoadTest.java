package kr.irolab.will.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.irolab.will.rest.auth.login.WillLoginReqPayLoad;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class WillLoginReqPayLoadTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println();
		System.out.println("WillLoginReqPayLoadTest.setUp()");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("WillLoginReqPayLoadTest.tearDown()");
		System.out.println();
	}

	@Test
	void test() throws JsonProcessingException {
		System.out.println("WillLoginReqPayLoadTest.test()");
		WillLoginReqPayLoad req = new WillLoginReqPayLoad();
		req.setUserId("user");
		req.setUserPw("pass");

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(req);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(req));
		log.info("json {}", json);

//		final String check = "{\"userId\":\"user\",\"userPw\":\"pass\"} ";
//		assertEquals(json, check, "FAILED");
	}

	@Test
	void test2() throws Exception {
		System.out.println("WillLoginReqPayLoadTest.test2()");
	}

}