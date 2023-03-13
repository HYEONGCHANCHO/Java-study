package exam02;

import java.util.List;

public interface MemberDAO {
	void add(MemberDTO data);
	void del(String memId);
	void update(MemberDTO data);
	MemberDTO get(String memId);
	List<MemberDTO> getAll();

}
