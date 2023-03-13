package exam02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MemberDTO {
	private String memId;
	private String memPwd;  
	private String memName;
	private String email;
}
