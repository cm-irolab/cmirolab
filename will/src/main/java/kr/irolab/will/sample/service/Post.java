package kr.irolab.will.sample.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class Post {
	Integer PostNo;
	String PostCatname;
	String PostTitle;
	String PostText;
	String PostFile;
	String PostCreateDt;
}
