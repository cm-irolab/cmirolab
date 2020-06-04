package kr.irolab.will.rest.service.board;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@NotBlank
public class WillPbcWillPayLoad {	
	Integer WillNo;
	String willTitle;
	String willText;
	String willCreateDt;
}
