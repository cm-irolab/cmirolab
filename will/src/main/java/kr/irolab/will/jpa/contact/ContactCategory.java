package kr.irolab.will.jpa.contact;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class ContactCategory {

	@Id
	private String catFriend; // 카테고리 친구
	private String catFamily; // 카테고리 가족
	private String catLovers; // 카테고리 연인

	@OneToMany
	@JoinColumn(name = "CONT_NO", insertable = false, updatable = false)
	private List<ContactJpaModel> contactModel;
}
