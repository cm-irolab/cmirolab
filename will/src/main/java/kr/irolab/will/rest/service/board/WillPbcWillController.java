package kr.irolab.will.rest.service.board;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.irolab.will.rest.service.WillServiceResPayLoad;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/service")
public class WillPbcWillController {

	@Autowired
	WillPbcWillService service;

	@PostConstruct
	public void init() {
		log.info("init");
	}

	@ResponseBody
	@GetMapping("/public-will")
	public ResponseEntity<?> gets() {
		WillServiceResPayLoad result = service.gets();
		log.debug("{}", result);
		return ResponseEntity.ok(result);
	}
}
