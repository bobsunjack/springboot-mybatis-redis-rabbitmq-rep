package cn.wcj.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rabbitmq.client.AMQP.Queue;

import cn.wcj.springboot.App;
/**
 * 
 * <p>Module:RabbitMQTest </p>
 * <p>Description:RabbitMQ测试发送消息 </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午11:19:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={App.class})
public class RabbitMQTest {

	
	@Autowired
	private AmqpTemplate amqpTemplate   ; //注入模板
	
	
	@Test
	public void testSend()throws Exception{
		amqpTemplate.convertAndSend("ZZU-QUEUE", "HelloZZU!!!");
	}
	
	
	
	
	
}
