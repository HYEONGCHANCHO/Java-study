package exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDAOImpl implements MemberDAO {
	
	@Override
	public void add(MemberDTO data) {
		Connection con =DBConnection.getConn();
		PreparedStatement ps =null;
		try {
			ps =con.prepareStatement("insert into mymembers values(?,?,?,?)");
			ps.setString(1, data.getMemId());
			ps.setString(2, data.getMemPwd());
			ps.setString(3, data.getMemName());
			ps.setString(4, data.getEmail());
			ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(null, ps, con);
		}
		
	}

	@Override
	public void del(String memId) {
		Connection con =DBConnection.getConn();
		PreparedStatement ps =null;
		try {
			ps =con.prepareStatement("delete from  mymembers where memId = ?");
			ps.setString(1, memId);
			ps.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(null, ps, con);
		}
	}

	@Override
	public void update(MemberDTO data) {
			Connection con =DBConnection.getConn();
			PreparedStatement ps =null;
			try {
				ps =con.prepareStatement("update mymembers set memPwd= ?,memName=?,email=? where memId = ?");
				ps.setString(4, data.getMemId());
				ps.setString(1, data.getMemPwd());
				ps.setString(2, data.getMemName());
				ps.setString(3, data.getEmail());
				ps.executeUpdate();
			} catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBConnection.close(null, ps, con);
			}
	}

	@Override
	public MemberDTO get(String memId) {
		Connection con =DBConnection.getConn();
		PreparedStatement ps =null;
		ResultSet rs=null;
		MemberDTO resultDto = null;
		try {
			ps =con.prepareStatement("select * from mymembers where memId=?");
			ps.setString(1, memId);
			rs= ps.executeQuery();
			if(rs.next()) {
				resultDto = new MemberDTO();
				resultDto.setEmail(rs.getString("email"));
				resultDto.setMemId(rs.getString("memId"));
				resultDto.setMemName(rs.getString("memName"));
				resultDto.setMemPwd(rs.getString("memPwd"));
				return resultDto;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(rs, ps, con);
		}
		return resultDto;
	}

	@Override
	public List<MemberDTO> getAll() {
		Connection con =DBConnection.getConn();
		PreparedStatement ps =null;
		ResultSet rs=null;
		List<MemberDTO> list = new ArrayList<>();
		try {
			ps =con.prepareStatement("select * from mymembers");
			rs= ps.executeQuery();
			while(rs.next()) {
				MemberDTO resultDto = new MemberDTO();
				resultDto.setEmail(rs.getString("email"));
				resultDto.setMemId(rs.getString("memId"));
				resultDto.setMemName(rs.getString("memName"));
				resultDto.setMemPwd(rs.getString("memPwd"));
				list.add(resultDto);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBConnection.close(rs, ps, con);
		}
		return list;
	
	}

}
