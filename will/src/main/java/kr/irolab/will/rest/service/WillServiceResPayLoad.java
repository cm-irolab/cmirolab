package kr.irolab.will.rest.service;

import java.util.ArrayList;
import java.util.List;

import kr.irolab.will.sample.service.ResponsePayload;
import lombok.Data;

@Data
public class WillServiceResPayLoad {
	Integer code = null;
	String message = null;
	List<Object> data = new ArrayList<>();

}