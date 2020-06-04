package kr.irolab.will.rest.userno.userWill;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class WillUserWillService {

	public List<WillUserWillReqPayload> gets() {
		List<WillUserWillReqPayload> list = new ArrayList<>();
		WillUserWillReqPayload payload = new WillUserWillReqPayload();
		

		return list;
	}
}
