package kr.irolab.will.jpa.willList;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.transaction.Transactional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import kr.irolab.will.jpa.member.MemberJpaModel;
import kr.irolab.will.jpa.member.MemberJpaService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(SpringExtension.class)
@SpringBootTest
class ListRepositoryTest {

	@Autowired
	private ListRepository repository;

	@Autowired
	private MemberJpaService re;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println();
		System.out.println("ListRepositoryTest.setUp()");

	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("ListRepositoryTest.tearDown()");
		System.out.println();
	}

	@Test
	@Transactional
	public void jpaTest() {
		System.out.println("ListRepositoryTest.jpaTest()");
		ListJpaModel model = new ListJpaModel();
		ListJpaPation pation = new ListJpaPation();
//		ContactJpaModel contact = new ContactJpaModel();
		MemberJpaModel member = new MemberJpaModel();
		LocalDateTime now = LocalDateTime.now();
		String createAt = now.format(DateTimeFormatter.ISO_DATE_TIME);

		pation.setWillNo(1);
		pation.setPublicYn("공개");

		MemberJpaModel newer = inertMember(member);

//

		model.setMemberNo(newer.getMemberNo());
//		model.setMember(member);
		model.setListJpaPation(pation);
		model.setWillTitle("will 제목");
		model.setWillText("will 내용 : 세상에 남기는 편지");
		model.setWillFile("picture.jpg");
		model.setWillCreateDt(createAt);

//		ArrayList<ContactJpaModel> contactList = new ArrayList<>();
//		contactList.add(contact);

//		List<MemberJpaModel> modelList = new ArrayList();
//		modelList.add(member);

//		model.setContact(contactList);

		ListJpaModel result = repository.save(model);
		log.info("model: {}", result);
		log.info("member1: {}", result.getMember());

		ListJpaPation id = result.getListJpaPation();
		ListJpaModel find = repository.findById(id).orElse(null);
		log.info("find: {}", find);
		log.info("member2: {}", find.getMember());

	}

	@Transactional
	public MemberJpaModel inertMember(MemberJpaModel member) {
		// contact.setContNo(1);
		// member.setMemberNo(2);
		member.setMemberName("임채민");
		member.setMemberEmail("coals2020@Naver.com");
		member.setMemberPassword("123456");
		member.setMemberPhone("010-1234-1234");
		member.setMemberAuth("success");
		member.setMemberSece("no");
		MemberJpaModel newer = re.insert(member);
		log.info("member: {}", newer);
		return newer;
	}

}