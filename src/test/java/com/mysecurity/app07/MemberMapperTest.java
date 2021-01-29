package com.mysecurity.app07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mysecurity.dto.MemberDTO;
import com.mysecurity.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/root-context.xml",
	"file:src/main/webapp/WEB-INF/spring/security-context.xml"
})
@Log4j2
public class MemberMapperTest {
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testRead() {
		MemberDTO member = mapper.read("admin90");
		System.out.println(member);
		//member.getAuthList().forEach(authVO 
	//			             ->System.out.println(authVO)
	//	);
		member.getAuthList()
		                 .forEach(authVO ->log.info(authVO));
		
	}

}
