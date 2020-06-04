package kr.irolab.will.jpa.contact;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import kr.irolab.will.jpa.willList.ListJpaPation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_NULL)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONTACT")
public class ContactJpaModel {
	@Column
	String userInfo;
	
	@Id
	@Column(name="CONT_NO")
	Integer contNo;			//연락처 번호
	
	String contName;		//연락처 이름
	String contEmail;		//연락처 이메일
	String contPhone;		//연락처 전화번호
	String contDesc;		//연락처 설명
	String contRepYn;		//대표친구 여부
	String contRepAuthYn;	//대표친구 인증 여부
	private ListJpaPation listJpaPation;

//	@OneToOne
//	@JoinColumn(name = "no", insertable = false, updatable = false)
//	private MemberJpaModel member;
}
