package cn.wcj.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.wcj.springboot.config.ApplicationConfig;

/**
 * 
 * <p>Module:App </p>
 * <p>Description:SpringBoot微架构应用部署运行 </p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午4:53:51
 */
@SpringBootApplication
@SpringBootConfiguration
public class App {
     public static void main(String[] args) throws Exception{
     	SpringApplication application = new SpringApplication(ApplicationConfig.class);
     	application.run(args)   ;
	  }
}
