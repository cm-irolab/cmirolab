package kr.irolab.will.test2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
class Test2RestService {

	public List<Test2ResultPayload> gets() {
		List<Test2ResultPayload> list = new ArrayList<>();

		Test2ResultPayload payload = new Test2ResultPayload();
		payload.setVal("1234");
		payload.setName("이름");
		list.add(payload);

		return list;
	}

	public boolean post(Test2PostReqPayload req) {
		log.info("request: {}", req);
		
		return true;
	}

}
