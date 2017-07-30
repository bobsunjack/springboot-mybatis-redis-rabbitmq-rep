package cn.wcj.springboot.config;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;


/**
 * 
 * <p>Module:ApplicationConfig </p>
 * <p>Description:加载配置文件、作为父项加载其他JavaConfig</p>
 * <p>Company:Software College Of ZhengZhou University </p> 
 * @author SuccessKey(WangCJ)
 * @date 2017年7月30日 下午5:15:50
 * Tips:application.properties不用导入，SpringBoot自己处理
 */
@Configuration
@PropertySource(value = { "classpath:common/jdbc.properties",
		                   "classpath:common/log4j.properties"})
@ComponentScan(basePackages = "cn.wcj.springboot") //加载其他JavaConfig
@ImportResource(value = "classpath:dubbo/dubbo-provider.xml")
@SpringBootApplication
public class ApplicationConfig extends SpringBootServletInitializer{
	
	//发布时以此为入口，这是部署运行入口
	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApplicationConfig.class);
	}

}
