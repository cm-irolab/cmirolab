package kr.irolab.will.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import kr.irolab.will.rest.service.board.WillPostMagazinePayLoad;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONArray;

@Slf4j
class WillPostMagazinePayLoadTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println();
		System.out.println("WillPostListReqPayLoadTest.setUp()");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("WillPostListReqPayLoadTest.tearDown()");
		System.out.println();
	}

	@Test
	void test() throws JsonProcessingException {
		System.out.println("WillPostListReqPayLoadTest.test()");
		WillPostMagazinePayLoad req = new WillPostMagazinePayLoad();
		req.setPostNo(1);
//		req.setPostCatName("매거진");
		req.setPostTitle("제목");
		req.setPostText("매거진내용");
		req.setPostFile("url");
		req.setPostCreateDt("2020-4-21");

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(req);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(req));
		log.info("json {}", json);

	}

	
}
