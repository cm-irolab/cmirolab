package kr.irolab.will.jpa.board;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class BoardCategory {

	@Id
	private Integer categoryNo;
	private String categoryTitle;

	@OneToOne
	@JoinColumn(name = "BOARD_NO", insertable = false, updatable = false)
	private BoardJpaModel boardModel;
}
