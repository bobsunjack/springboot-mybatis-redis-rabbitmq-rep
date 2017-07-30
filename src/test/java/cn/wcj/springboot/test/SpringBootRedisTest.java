package cn.wcj.springboot.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wcj.springboot.App;
/**
 * 
 * <p>Module:SpringBootRedisTest </p>
 * <p>Description:SpringBoot整合Redis测试 </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午9:29:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={App.class})
public class SpringBootRedisTest {

	@Autowired
	private StringRedisTemplate stringRedisTemplate  ;
	
	@Test
	public void testSet()throws Exception{
		stringRedisTemplate.opsForValue().set("msg", "coder520");
	}
	
	
	
}
