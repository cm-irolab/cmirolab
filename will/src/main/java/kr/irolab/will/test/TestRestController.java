package kr.irolab.will.test;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/test")
public class TestRestController {

	@Autowired
	TestRestService service;

	@PostConstruct
	void init() {
		log.debug("init");
	}

	@GetMapping
	public Object gets() {
		log.debug("gets");
		int result = service.post();
		return ResponseEntity.ok(result);
	}

}
