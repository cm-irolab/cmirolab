package kr.irolab.will.test2;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
class Test2PostReqPayload {
	@NotBlank
	String net;
	String sta;
	String chn;
	String yday;
	String crttype;
	String basedir;

	@Min(1)
	@Max(100)
	Integer value;

	@NotNull
	Double item;
}
