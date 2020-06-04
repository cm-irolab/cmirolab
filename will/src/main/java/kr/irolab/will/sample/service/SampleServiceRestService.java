package kr.irolab.will.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
class SampleServiceRestService {

	@Autowired
	SampleServiceProcessService service;

	public ResponsePayload gets() {
		ResponsePayload payload = new ResponsePayload();
		List<Post> list = service.gets();
		payload.setCode(200);
		payload.setData(list);
		return payload;
	}

	public ResponsePayload post(Post req) {
		log.info("request: {}", req);
		Post newer = service.post(req);
		ResponsePayload payload = new ResponsePayload();
		payload.setCode(200);
		payload.setData(newer);
		return payload;
	}

}
