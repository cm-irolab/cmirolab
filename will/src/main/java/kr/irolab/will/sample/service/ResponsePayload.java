package kr.irolab.will.sample.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
public class ResponsePayload {
	Integer code = null;
	String message = null;
	Object data = null;
}
