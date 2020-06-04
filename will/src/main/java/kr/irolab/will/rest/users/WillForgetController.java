package kr.irolab.will.rest.users;

import java.net.BindException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class WillForgetController {

	@Autowired
	WillForgetService service;

	@PostMapping("/forget")
	public ResponseEntity<?> post(@Valid @RequestBody String req, BindingResult br) {
		String res = service.post(req);

		return ResponseEntity.ok(res);

	}

	@PutMapping("/join")
	public ResponseEntity<?> put(@Valid @RequestBody String req, BindingResult br) throws BindException {
		if (br.hasErrors()) {
			String message = br.toString();
			throw new BindException(message);
		}

		List<WillForgetReqPayLoad> res = service.put(req);
		return ResponseEntity.ok(res);
	}
}
