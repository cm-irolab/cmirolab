package kr.irolab.will.rest.service.board;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@NotBlank
@Data
public class WillPostMagazinePayLoad {
	Integer PostNo;
	String PostCatname;
	String PostTitle;
	String PostText;
	String PostFile;
	String PostCreateDt;

}
