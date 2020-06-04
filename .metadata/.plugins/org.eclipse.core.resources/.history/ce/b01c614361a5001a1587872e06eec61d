package kr.irolab.will.jpa.willList;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class ListJpaPation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6864110542530433L;

	@Column(name = "WILL_NO")
	private Integer willNo;

	@Column(name = "PUBLIC_YN")
	private String publicYn;

	public ListJpaPation() {

	}

	public ListJpaPation(int willNo, String publicYn) {

		this.willNo = willNo;
		this.publicYn = publicYn;
	}

}
