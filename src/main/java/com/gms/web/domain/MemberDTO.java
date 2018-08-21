package com.gms.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class MemberDTO {
	private String userId, password, name, ssn, age, gender, teamId, roll, subject;
}
