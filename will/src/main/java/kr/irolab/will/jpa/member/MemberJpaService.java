package kr.irolab.will.jpa.member;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import kr.irolab.will.logic.process.auth.login.WillLoginProcessService;

@Service
public class MemberJpaService {
	
	@Autowired
	WillLoginProcessService service;
	
	@Autowired
	MemberRepository repository;

	public Optional<MemberJpaModel> findById(Integer model) {
		return repository.findById(model);
	}

	public MemberJpaModel insert(MemberJpaModel model) {
		MemberJpaModel memberModel = repository.save(model);
		return memberModel;
	}

	public MemberJpaModel update(MemberJpaModel model) {
		MemberJpaModel memberModel = repository.save(model);
		return memberModel;

	}

	public Optional<MemberJpaModel> select(@PathVariable Integer memberNo) {
		Optional<MemberJpaModel> opt = repository.findById(memberNo);
		return opt;

	}
	
//	public List<MemberJpaModel> findAll(MemberJpaModel memberNo){
//		
//		return service.findAll(memberNo);
//	}
	
	
}
