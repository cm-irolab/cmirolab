package kr.irolab.will.rest.userno.contact;

import lombok.Data;

@Data
public class WillContactPayLoad {
	 Integer ContNo= 0;
     String ContName = null;
     String ContEmail = null;
     String ContDesc = null;
     String ContPhone = null;
     String ContRepYn = null;
     String ContRepAuthYn = null;
     String ContCatname = null;
}