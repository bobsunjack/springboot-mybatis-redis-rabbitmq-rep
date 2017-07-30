package cn.wcj.springboot.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wcj.springboot.App;
import cn.wcj.springboot.mybatis.pojo.po.TbMember;
import cn.wcj.springboot.mybatis.service.IMemberService;
/**
 * 
 * <p>Module:MemberServiceTest </p>
 * <p>Description:SpringBoot单元测试，注意启动类是App(带有main方法)而不是ApplicationConfig </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午8:40:59
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={App.class})
public class MemberServiceTest {

	@Autowired
	private IMemberService memberService   ;
	
	@Test
	public void testDoRemove()throws Exception{
		memberService.doRemove("2017000")  ;
	}
	
	@Test
	public void testFindAll()throws Exception{
		List<TbMember> list = memberService.findAll();
		System.out.println(list.size());
	}
	
	@Test
	public void testFindById()throws Exception{
		TbMember tbMember = memberService.findById("2017001");
		System.out.println(tbMember);
	}
	
	
}
