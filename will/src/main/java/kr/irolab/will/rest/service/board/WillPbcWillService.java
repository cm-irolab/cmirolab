package kr.irolab.will.rest.service.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kr.irolab.will.rest.service.WillServiceResPayLoad;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class WillPbcWillService {
	
	public WillServiceResPayLoad gets(){
		WillServiceResPayLoad list = new WillServiceResPayLoad();
		WillPbcWillPayLoad payload = new WillPbcWillPayLoad();
		
		payload.setWillNo(2);
		payload.setWillTitle("안녕하세요");
		payload.setWillText("내용입니다.");
		payload.setWillCreateDt("2020-02-11");
		
		list.setCode(200);
		list.setMessage("Success");
		list.getData().add(payload);
		
		return list;
	}
}