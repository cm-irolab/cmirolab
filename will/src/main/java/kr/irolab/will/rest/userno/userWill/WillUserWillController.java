package kr.irolab.will.rest.userno.userWill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/userno")
public class WillUserWillController {

	@Autowired
	WillUserWillService service;

	@GetMapping("{user_no}/user-wills")
	public ResponseEntity<?> gets() {
		List<WillUserWillReqPayload> req = service.gets();
		return ResponseEntity.ok(req);
	}
}
