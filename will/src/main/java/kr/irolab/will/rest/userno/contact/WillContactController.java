package kr.irolab.will.rest.userno.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.irolab.will.rest.userno.WillUsernoResPayLoad;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/userno")
public class WillContactController {
	
	@Autowired
	WillContactService service;
	
	@GetMapping("{user_no}/user-conts")
	public ResponseEntity<?> gets(){
		WillUsernoResPayLoad res = service.gets();
		
		return ResponseEntity.ok(res);
	}
}
