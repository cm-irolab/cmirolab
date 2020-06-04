package kr.irolab.will.rest.userno;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class WillUsernoResPayLoad {
	Integer code = null;
	String message = null;
	List<Object> data = new ArrayList<>();
}
