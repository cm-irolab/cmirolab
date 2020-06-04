package kr.irolab.will.jpa.test.child;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CHILD")
public class Child {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer childId;

	Integer parentId;
}
