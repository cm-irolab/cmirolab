package kr.irolab.will.test2;

import java.net.BindException;
import java.util.List;

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
@RequestMapping("/api/test2")
class Test2RestController {

	@Autowired
	Test2RestService service;

	@GetMapping
	public ResponseEntity<?> gets() {
		log.debug("gets");
		List<Test2ResultPayload> result = service.gets();
		return ResponseEntity.ok(result);
	}

	@PostMapping
	public ResponseEntity<?> post(@Valid @RequestBody Test2PostReqPayload req, BindingResult br) throws BindException {
		if (br.hasErrors()) {
			br.getAllErrors().stream() //
					.forEach(System.out::println);
			throw new BindException("invalid");
		}

		boolean res = service.post(req);
		return ResponseEntity.ok(res);
	}

}
