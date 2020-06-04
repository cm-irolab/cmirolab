package kr.irolab.will.rest.userno.userWill;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class WillUserWillReqPayload {
	@NotBlank
	int willNo;
	String willTilte;
	String willText;
	String willImg;
	String willAttr;
	String willCreateDt;
}
