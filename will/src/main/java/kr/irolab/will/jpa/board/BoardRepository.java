package kr.irolab.will.jpa.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BoardRepository extends JpaRepository<BoardJpaModel, Integer>{

}
