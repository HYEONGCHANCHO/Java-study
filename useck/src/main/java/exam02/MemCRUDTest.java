package exam02;

import java.util.List;

public class MemCRUDTest {

	public static void main(String[] args) {

		MemberDTO data1 = new MemberDTO("chan", "chan123", "조형찬", "chan@naver.com");
		MemberDTO data2 = new MemberDTO("kan", "kan889", "강혁규", "kangH@naver.com");
		MemberDTO data3 = new MemberDTO("pyo", "991157", "표한철", "PYOHC@naver.com");
		
		
		MemberDAO dao = new MemberDAOImpl();
//		dao.add(data1);
//		dao.add(data2);
//		dao.add(data3);
		
//		dao.del("chan");
//		data2.setMemPwd("hh222"); data2.setEmail("sdsd@naver.com");
//		dao.update(data2);
		
//		MemberDTO resultDTO = dao.get("chan");
		List<MemberDTO> list = dao.getAll();
		for(MemberDTO dto : list) System.out.println(dto);

 
	}

}
