package kr.irolab.will.rest.userno.alive;

import lombok.Data;

@Data
public class WillUserAliveResPayLoad {
	String AliveSendHopeYn = null;
	String AliveStartDt = null;
	String AliveUserConfirmEndDt = null;
	String AliveFdConfirmEndDt = null;
}
