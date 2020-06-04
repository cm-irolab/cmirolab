package kr.irolab.will.rest.users;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class WillForgetReqPayLoad {
	@NotBlank
	String userEmail;
	String userName;
	String userPhone;
	String userPw;
}
