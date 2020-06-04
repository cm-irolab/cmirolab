package kr.irolab.will.rest.auth.login;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import kr.irolab.will.jpa.member.MemberJpaModel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
class WillLoginControllerTest {

	@Autowired
	private WillLoginService service;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println();
		System.out.println("WillLoginControllerTest.setUp()");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("WillLoginControllerTest.tearDown()");
		System.out.println();
	}

	@Test
	void controllerTest() {
		System.out.println("WillLoginControllerTest.controllerTest()");
		MemberJpaModel model = new MemberJpaModel();
		model.setMemberNo(1);
	
		
		Optional<MemberJpaModel> result = service.findById(1);
		log.info("result : ", result);
		System.out.println(result);


	}

//	@Transactional
//	public Optional<MemberJpaModel> viewMember(Integer memberNo) {
//
//		Optional<MemberJpaModel> newer = service.findById(memberNo);
//		log.info("member: {}", newer);
//		return newer;
//	}
}
