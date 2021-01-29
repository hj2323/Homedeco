package com.mysecurity.app07;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
@Log4j2
public class MemberTest {
	@Autowired
	private PasswordEncoder pwencoder;
	@Autowired
	private DataSource ds;
	
	@Test
	public void testinsertMember() {
		String sql = "insert into tbl_member2(userid, userpw, username) values(?,?,?)";
		for(int i=0; i<100;i++) {
			Connection con =null;
			PreparedStatement ps = null;
			
			try {
				con = ds.getConnection();
				ps= con.prepareStatement(sql);
				
				ps.setString(2, pwencoder.encode("pw"+i));
				if(i<80) {
					ps.setString(1, "user"+i);
					ps.setString(3, "일반사용자"+i);
				} else if(i<90) {
					ps.setString(1, "manager"+i);
					ps.setString(3, "운영자"+i);
				}else {
					ps.setString(1, "admin"+i);
					ps.setString(3, "관리자"+i);
				}
				ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
			     if(ps != null) { try { ps.close();  } catch(Exception e) {} }
			      if(con != null) { try { con.close();  } catch(Exception e) {} }
			}
		}//for
			
	}//testinsertMember
	
	@Test
	public void testInsertAuth() {
		String sql="insert into tbl_auth(userid, auth) values(?,?)";

		for(int i=0; i<100;i++) {
			Connection con =null;
			PreparedStatement ps = null;
			
			try {
				con = ds.getConnection();
				ps= con.prepareStatement(sql);
	
				if(i<80) {
					ps.setString(1, "user"+i);
					ps.setString(2, "ROLE_USER");
				} else if(i<90) {
					ps.setString(1, "manager"+i);
					ps.setString(2, "ROLE_MANAGER");
				}else {
					ps.setString(1, "admin"+i);
					ps.setString(2, "ROLE_ADMIN");
				}
				ps.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
			     if(ps != null) { try { ps.close();  } catch(Exception e) {} }
			      if(con != null) { try { con.close();  } catch(Exception e) {} }
			}
	
	  }  //for
	}  //testInsertAuth
	
	

}//class









