package kr.irolab.will.jpa.willSend;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "willSendTb")
public class SendJpaModel {
	@Id
	String sendFinishYn;

}
