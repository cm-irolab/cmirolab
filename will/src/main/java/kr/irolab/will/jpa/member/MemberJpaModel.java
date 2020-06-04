package kr.irolab.will.jpa.member;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MEMBER")
public class MemberJpaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MEMBER_N0")
	private Integer memberNo = 0; 			// 회원 번호
	private String memberName = null; 		// 회원 이름
	private String memberEmail = null; 		// 회원 이메일
	private String memberPassword = null; 	// 회원 비밀번호
	private String memberPhone = null; 		// 회원 전화번호
	private String memberAuth = null; 		// 회원 인증여부
	private String memberSece = null; 		// 회원 탈퇴여부

}
