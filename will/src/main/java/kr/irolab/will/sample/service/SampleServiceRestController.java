package kr.irolab.will.sample.service;

import java.net.BindException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/sample/service")
class SampleServiceRestController {

	@Autowired
	SampleServiceRestService service;

	@GetMapping
	public ResponseEntity<?> gets() {
		log.debug("gets");
		ResponsePayload result = service.gets();
		return ResponseEntity.ok(result);
	}

	@PostMapping
	public ResponseEntity<?> post(@Valid @RequestBody Post req, BindingResult br) throws BindException {
		if (br.hasErrors()) {
			br.getAllErrors().stream() //
					.forEach(System.out::println);
			throw new BindException("invalid");
		}
		ResponsePayload res = service.post(req);
		return ResponseEntity.ok(res);
	}

}
