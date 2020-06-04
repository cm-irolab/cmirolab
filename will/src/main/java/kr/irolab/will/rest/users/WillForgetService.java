package kr.irolab.will.rest.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service

public class WillForgetService {

	public String post(String res) {
		log.info("request : ", res);
		return res;
	}

	public List<WillForgetReqPayLoad> put(String res) {
		List<WillForgetReqPayLoad> list = new ArrayList<>();

		WillForgetReqPayLoad payload = new WillForgetReqPayLoad();
		payload.setUserName("이름");
		payload.setUserEmail("이메일");
		payload.setUserPhone("전화번호");
		payload.setUserPw("비밀번호");
		list.add(payload);
		return list;

	}
}
