package kr.irolab.will.rest.userno.secesstion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/userno")
public class WillSecesstionController {
	
//	@Autowired
//	WillSecesstionService service;
//	
//	@PostMapping("{user_no}/secesstion")
//	public ResponseEntity<?> reqPost(){
//		List<WillSecesstionReqPayLoad> req = service.reqPost();
//		
//		return ResponseEntity.ok(req);
//	}
//	
//	@PostMapping("{user_no}/secesstion")
//	public ResponseEntity<?> resPost(){
//		WillUsernoResPayLoad res = service.resPost();
//		
//		return ResponseEntity.ok(res);
//	}
}
