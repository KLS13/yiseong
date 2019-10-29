
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.koreait.db.DBConnect;

public class Insert {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String[] sqls = {
				"insert into member (no, id, pw, email, grade) values (member_seq.nextval, 'id01', '1111', 'id01@aa.com', 'vip')",
				"insert into member (no, id, pw, email, grade) values (member_seq.nextval, 'id02', '2222', 'id02@bb.com', 'gold')",
				"insert into member (no, id, pw, email, grade) values (member_seq.nextval, 'id03', '3333', 'id03@aa.com', 'vip')",
				"insert into member (no, id, pw, email, grade) values (member_seq.nextval, 'id04', '4444', 'id04@bb.com', 'gold')",
				"insert into member (no, id, pw, email, grade) values (member_seq.nextval, 'id05', '5555', 'id05@aa.com', 'vip')"
			};
			
			for (String sql : sqls) {
				ps = conn.prepareStatement(sql);
				int result = ps.executeUpdate();
				System.out.println(result > 0 ? "insert 성공" : "insert 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
