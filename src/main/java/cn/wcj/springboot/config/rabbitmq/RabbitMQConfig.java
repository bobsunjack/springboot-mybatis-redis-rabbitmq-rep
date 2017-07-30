package cn.wcj.springboot.config.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * <p>Module:RabbitMQConfig </p>
 * <p>Description:RabbitMQ细粒度配置 </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午11:02:18
 */
@Configuration
public class RabbitMQConfig {

	@Autowired
    private ConnectionFactory connectionFactory;

    // 管理
    @Bean
    public RabbitAdmin rabbitAdmin() {
        return new RabbitAdmin(connectionFactory);
    }

    // 声明队列:郑州大学队列
    @Bean
    public Queue zzuQueue() {
        // 默认就是自动声明的
        return new Queue("ZZU-QUEUE", true);
    }

    // 声明队列:王成键队列 
    @Bean
    public Queue wcjQueue() {
        // 默认就是自动声明的
        return new Queue("WCJ-QUEUE", true);
    }

	
}
