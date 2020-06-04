package kr.irolab.will.jpa.board;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class BoardJpaService {
	
	@Autowired
	BoardRepository repository;
	
	public List<BoardJpaModel> findAll(){
		return repository.findAll();
	}
	
	public BoardJpaModel insert(BoardJpaModel model) {
		BoardJpaModel boardModel =repository.save(model);
		return boardModel;
	}
	public Optional<BoardJpaModel> view(@PathVariable Integer Id) {
		Optional<BoardJpaModel> boardModel = repository.findById(Id);
		return boardModel;

	}

	public String delete(@PathVariable Integer Id) {
		repository.deleteById(Id);
		return "redirect:/TodoModel/list";

	}

	public BoardJpaModel update(BoardJpaModel model) {
		BoardJpaModel boardModel = repository.save(model);
		return boardModel;
	}
}
