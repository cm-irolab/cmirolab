package kr.irolab.will.rest.auth.login;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.irolab.will.jpa.member.MemberJpaModel;
import kr.irolab.will.logic.process.auth.login.WillLoginProcessService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class WillLoginService {

	@Autowired
	WillLoginProcessService service;

	public Optional<MemberJpaModel> findById(Integer model) {
		return service.findById(model);
	}

	public String post(String res) {
		log.info("request : ", res);
		return res;

	}

	
}
