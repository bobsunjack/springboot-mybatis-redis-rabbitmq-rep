package cn.wcj.springboot.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 
 * <p>Module:MsgListener </p>
 * <p>Description:RabbitMQ消息监听 </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午11:29:10
 */
@Component
public class MsgListener {

	@RabbitListener(queues={"ZZU-QUEUE"})
	public void execute(String msg){
		System.out.println("监听到消息:"+msg);
	}
	
}
