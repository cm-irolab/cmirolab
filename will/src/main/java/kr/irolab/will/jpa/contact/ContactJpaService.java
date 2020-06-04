package kr.irolab.will.jpa.contact;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ContactJpaService {

	@Autowired
	ContactRepository repository;

	public List<ContactJpaModel> findAll() {
		return repository.findAll();
	}

	public ContactJpaModel insert(ContactJpaModel model) {
		ContactJpaModel contactModel = repository.save(model);
		return contactModel;
	}

	public Optional<ContactJpaModel> view(@PathVariable Integer Id) {
		Optional<ContactJpaModel> contactModel = repository.findById(Id);
		return contactModel;

	}

	public String delete(@PathVariable Integer Id) {
		repository.deleteById(Id);
		return "redirect:/TodoModel/list";

	}

	public ContactJpaModel update(ContactJpaModel model) {
		ContactJpaModel contactModel = repository.save(model);
		return contactModel;
	}
}
