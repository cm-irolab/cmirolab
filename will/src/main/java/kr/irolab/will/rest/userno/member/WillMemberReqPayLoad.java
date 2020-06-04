package kr.irolab.will.rest.userno.member;

import lombok.Data;

@Data
public class WillMemberReqPayLoad {
	String UserNo = null;
	String UserName = null;
	String UserEmail = null;
	String UserPhone = null;
}
