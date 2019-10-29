import java.sql.Connection;
import java.sql.PreparedStatement;
import com.koreait.db.DBConnect;

public class Create {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "create table member ( no number not null primary key, "+
			"id varchar2(20) not null unique, pw varchar2(20) not null, email varchar2(40) unique, "+
			"point number default 1000 check (point between 0 and 10000) not null, "+
			"grade varchar2(10) check (grade in('vip','gold')), regdate date default sysdate not null)";
			
			ps = conn.prepareStatement(sql);
			ps.execute();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

