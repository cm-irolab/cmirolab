package kr.irolab.will.rest.auth.login;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class WillLoginResPayLoad {
	Integer code = null;
	String message = null;
	List<Object> data = new ArrayList<>();
}
